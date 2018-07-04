package test;

import bean.JsonResult;
import com.alibaba.fastjson.JSON;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//上传文件的存储目录
	private static final String UPLOAD_DIRECTIORY="upload";
	
	//上传配置
	private static final int MEMORY_THRESHOLD=1023*1024*3;
	private static final int MAX_FILE_SIZE =1024*1024*40;
    private static final int MAX_REQUEST_SIZE=1024*1024*50;
    
    String type;
    
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//检查上传的文件是否是多媒体
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		if (!ServletFileUpload.isMultipartContent(request)) {
			//如果不是则停止
			PrintWriter writer=response.getWriter();
			writer.println("Error :表单必须包含 enctype=multipart/form-data");
		    writer.flush();
			return;
		}
		//配置参数
		DiskFileItemFactory factory=new DiskFileItemFactory();
		//设置内存临界值
		factory.setSizeThreshold(MEMORY_THRESHOLD);
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
		ServletFileUpload upload=new ServletFileUpload(factory);
		
		upload.setFileSizeMax(MAX_FILE_SIZE);
		upload.setSizeMax(MAX_REQUEST_SIZE);
		
		upload.setHeaderEncoding("UTF-8");
		
		String uploadPath=getServletContext().getRealPath("/")+File.separator+UPLOAD_DIRECTIORY;
		
		File uploadDir=new File(uploadPath);
		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		
		try {
			@SuppressWarnings("unchecked")
			List<FileItem> formItems= upload.parseRequest(request);
			 type=request.getParameter("type");
 			if (formItems!=null && formItems.size()>0) {
				for(FileItem item:formItems){
					if (!item.isFormField()) {
						String fileName=new File(item.getName()).getName();
						String filePath=uploadPath+File.separator+fileName;
						File storeFile=new File(filePath);
						System.out.println(filePath);
						item.write(storeFile);
						//request.setAttribute("message", "文件上传成功！");
						JsonResult<String> message	=JsonResult.ok(0, "文件上传成功>>>>>"+type);
						response.getWriter().append(JSON.toJSONString(message));
					}
					
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("message", e.getMessage());
			JsonResult<String> message	=JsonResult.error(306, "文件上传失败");
			response.getWriter().append(JSON.toJSONString(message));
		}
		
		//getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);
		
	}
	
}

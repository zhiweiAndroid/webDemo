package test;

import bean.AccountDkBankInfoReqDto;
import bean.JsonResult;
import bean.Person;
import com.alibaba.fastjson.JSON;
import service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class PostTest
 */
@WebServlet("/PostTest")
public class PostTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doPost(request, response);
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String json="";
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		if (request.getParameter("name") != null) {
			Person person = new Person(name, Integer.valueOf(age), gender);
			JsonResult<Person> pJsonResult = JsonResult.ok(person, "恭喜你post请求成功");
			json= JSON.toJSONString(pJsonResult);

		} else {
			JsonResult<AccountDkBankInfoReqDto> saveBankInfoforht = AccountService.saveBankInfoforht(true);
			json = JSON.toJSONString(saveBankInfoforht);
		}

		response.getWriter().append(json);
		
		
	}

}

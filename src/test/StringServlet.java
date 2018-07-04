package test;

import bean.AccountDkBankInfoReqDto;
import bean.JsonResult;
import bean.Person;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class StringServlet
 */
@WebServlet("/StringServlet")
public class StringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String a = "{\"UserID\":\"11\", \"Name\":{\"FirstName\":\"刘西美子\",\"LastName\":\"Tang\"}, \"Email\":\"18039010@qq.com\"}";
	Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StringServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String json="";
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		if (request.getParameter("name") != null) {
			Person person = new Person(name, Integer.valueOf(age), gender);
			JsonResult<Person> pJsonResult = JsonResult.ok(person, "恭喜你get请求成功");
			 json= JSON.toJSONString(pJsonResult);
			 logger.info("name>>>>>>> :" + name + "age>>>>> :+" + age);

		} else {
			JsonResult<AccountDkBankInfoReqDto> saveBankInfoforht = AccountService.saveBankInfoforht(true);
			json = JSON.toJSONString(saveBankInfoforht);
		}

		response.getWriter().append(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	
	
	
	
	
	
	

}

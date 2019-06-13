package cn.itcast.chapter05.response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestParamsServlet
 */
public class RequestParamsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
			String username=request.getParameter("username");
//			username=new String(username.getBytes("iso8859-1"),"utf-8");
			String password=request.getParameter("password");
			System.out.println("用户名"+username);
			System.out.println("密码;"+password);
			String[] hobbys=request.getParameterValues("hobby");
			System.out.println("爱好为:");
			
			for(int i=0;i<hobbys.length&&hobbys!=null;i++) {
				System.out.println(hobbys[i]);
			}
//			
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package cn.itcast.chapter05.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.getWriter().write("这是里doPost调用了doGet");
		
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(("itcast").equals(username)&&("123").equals(password)) {
			
			out.print("method22为:"+request.getMethod() );
			response.sendRedirect("/chapter05/welcome.html");
		}else {
//			response.sendRedirect("/chapter05/login.html");
			out.print("username名:"+request.getParameter("username") );
			out.print("222密码:"+request.getParameter("password") );
//			response.sendRedirect("/chapter05/login.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}

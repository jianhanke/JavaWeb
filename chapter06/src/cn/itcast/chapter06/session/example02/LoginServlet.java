package cn.itcast.chapter06.session.example02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		System.out.println("login"+session);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		if(("itcast").equals(username) && ("1").equals(password)) {
			User user=new User();
			user.setUsername(username);
			user.setPassword(password);
			 
			session.setAttribute("user", user);
			Cookie cookie=new Cookie("JESSIONID",session.getId());
			cookie.setMaxAge(60*30);
			response.addCookie(cookie);
			response.sendRedirect("/chapter06/IndexServlet");
		}else {
			pw.write("��¼����");
			pw.write("<a href='/chapter06/Login.html'> ���µ�¼</a> ");
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

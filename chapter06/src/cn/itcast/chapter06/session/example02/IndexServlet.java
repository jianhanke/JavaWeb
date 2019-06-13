package cn.itcast.chapter06.session.example02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession session=request.getSession();
		System.out.println("index"+session);
		User user=(User) session.getAttribute("user");
		if(user==null) {
			response.getWriter().println("������û�е�¼,��<a href='/chapter06/Login.html'>��¼</a> ");
		}else {
			response.getWriter().println("���Ѿ���¼,��ӭ��"+user.getUsername()+"!");
			response.getWriter().println("<a href='/chapter06/LogoutServlet'>�˳�e</a> ");
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

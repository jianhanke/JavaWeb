package cn.itcast.chapter05.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludingServlet
 */
public class IncludingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			
			request.setCharacterEncoding("utf-8");
			RequestDispatcher rd=request.getRequestDispatcher("/IncludedServlet?p1=≤‚ ‘");
			request.setAttribute("aaa", "bbb");
			
			out.println("before including"+"<br> ");
			rd.include(request, response);
			out.println("after including"+"<br> ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

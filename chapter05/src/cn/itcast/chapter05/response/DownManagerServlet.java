package cn.itcast.chapter05.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownManagerServlet
 */
public class DownManagerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			String referer=request.getHeader("referer");
			out.println(referer+ "<br>");
			String sitePart="http://"+request.getServerName();
			out.println(sitePart+ "<br>");
			if(referer!=null &&referer.startsWith(sitePart)) {
				out.println("dealing download ....");
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("/download.html");
				rd.forward(request, response);
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

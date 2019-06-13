package cn.itcast.chapter05.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestNetServlet
 */
public class RequestNetServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("getRemoteAddr:"+request.getRemoteAddr()+"<br> " );
		out.println("getRemoteHost:"+request.getRemoteHost()+"<br> ");
		out.println("getRemotePort:"+request.getRemotePort()+"<br> ");
		out.println("getLocalAddr:"+request.getLocalAddr()+"<br> ");
		out.println("getLocalName:"+request.getLocalName()+"<br> ");
		out.println("getLocalPort:"+request.getLocalPort()+"<br> ");
		out.println("getServerName:"+request.getServerName()+"<br> ");
		out.println("getServerPort:"+request.getServerPort()+"<br> ");
		out.println("getScheme:"+request.getScheme()+"<br> ");
		out.println("getRequestURL:"+request.getRequestURL()+"<br> ");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

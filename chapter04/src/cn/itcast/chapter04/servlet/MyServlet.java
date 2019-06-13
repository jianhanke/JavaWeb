package cn.itcast.chapter04.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		ServletConfig config=this.getServletConfig();
		String param=config.getInitParameter("encoding");
		
		PrintWriter out=response.getWriter();
		out.println("encoding:1"+param);
		
		
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		this.doGet(request, response);
	}

}

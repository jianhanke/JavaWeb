package cn.itcast.chapter04.servlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet03 extends HttpServlet{
	protected void doGet(HttpServletRequest requests,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		ServletContext context=this.getServletContext();
		
		Enumeration <String> paramNames=context.getInitParameterNames();
		out.println("all the ParamNames and paramValue are following");
		while(paramNames.hasMoreElements()) {
			String name=paramNames.nextElement();
			String value=context.getInitParameter(name);
			out.println(name+":"+value);
			out.println("<br> ;");
		}
	}
	protected void doPost(HttpServletRequest requests,HttpServletResponse response)throws ServletException,IOException{
			this.doGet(requests, response);
		
	}
	
}

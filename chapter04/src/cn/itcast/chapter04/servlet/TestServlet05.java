package cn.itcast.chapter04.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class TestServlet05 extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
//		PrintWriter out=response.getWriter();
//		ServletContext context=this.getServletContext();
//		String data=(String)context.getAttribute("data");
//		out.println(data);
		
			
	ServletContext context=this.getServletContext();
	 Object param = context.getAttribute("aaaa");   //class.java.lang.String 
	 String param2 =(String) context.getAttribute("aaaa"); //class.java.lang.String
	
	response.setContentType("text/html;charset=utf-8");
	response.getWriter().println("从Test04取出aaaa的值:"+param);  //容器
	response.getWriter().println(param.getClass());
	response.getWriter().println(param2.getClass());
		
	}
	
	protected void doPost(HttpServletRequest requests,HttpServletResponse response)throws ServletException,IOException{
		this.doGet(requests, response);
	}
	
}

package cn.itcast.chapter04.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class TestServlet04 extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
//		PrintWriter out=response.getWriter();
//		ServletContext context=this.getServletContext();
//		context.setAttribute("data", "this is servlet save data");
		
		ServletContext context=this.getServletContext();
		context.setAttribute("aaaa","1111");
		
	}
	protected void doPost(HttpServletRequest requests,HttpServletResponse response)throws ServletException,IOException{
		this.doGet(requests, response);
	}
	
	
	
	
}

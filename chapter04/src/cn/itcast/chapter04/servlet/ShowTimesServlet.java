package cn.itcast.chapter04.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShowTimesServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		PrintWriter out=response.getWriter();
		ServletContext context=this.getServletContext();
//		int times=(int) context.getAttribute("times");
//		out.println(times);
//		if(times==null) {
//			times=new Integer(1);
//		}else {
//			times=new Integer(times.intValue()+1);  //intValue ½« Integer×ª»»Îªint 
//		}
//		times+=1;
//		out.println(times.getClass());
//		response.setContentType("text/html;charset=UTF-8");
//		
//		out.println(times);
//		context.setAttribute("times", times);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		this.doGet(request,response);
	}
	
}

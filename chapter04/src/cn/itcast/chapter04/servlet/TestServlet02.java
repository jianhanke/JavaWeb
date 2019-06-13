package cn.itcast.chapter04.servlet;
import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet02 extends HttpServlet{
	
	protected void doGet(HttpServletRequest requests,HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html;charset=utf-8");
		
		
		PrintWriter out=response.getWriter();
		
//		ServletConfig config=this.getServletConfig();
//		String param=config.getInitParameter("encoding");
//		out.println("encoding="+param);  								//��ȡ���Ǿֲ�����
//		  
//		ServletContext context=config.getServletContext();
//		Object param2=context.getInitParameter("encoding"); 
//		out.println("�� config.context ��ȡ�Ĳ���encoding:"+param2 );   	//��ȡ����ȫ�ֱ���
//			
//			
//		ServletContext context2=this.getServletContext();      			//��ȡ����ȫ�ֱ���
//		Object param3=context2.getInitParameter("encoding");
//		out.println("this.context.encoding: "+param3);
			
		ServletConfig config=this.getServletConfig();
		Enumeration names=config.getInitParameterNames();
		
		while(names.hasMoreElements()) {
			String name=(String) names.nextElement();
			String value=config.getInitParameter(name);
			out.println(value);
		}
	
		
	
		
	}
	protected void doPost(HttpServletRequest requests,HttpServletResponse response)throws ServletException,IOException{
		this.doGet(requests, response);
		
	}
}

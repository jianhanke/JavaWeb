package cn.itcast.chapter04.servlet;

import java.io.*;
import java.net.URL;

import javax.servlet.*;
import javax.servlet.http.*;

import com.oracle.webservices.internal.api.message.PropertySet.Property;

import java.util.*;

public class TestServlet06 extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=utf-8");
		ServletContext context=this.getServletContext();
		PrintWriter out=response.getWriter();
		
//		InputStream in=context.getResourceAsStream("/WEB-INF/classes/itcast.properties" );
//		Properties pros=new Properties();
//		pros.load(in);
//		out.println("Company="+pros.getProperty("Company")+"<br /> " );
//		out.println("Address="+pros.getProperty("Address"+"<br /> ") );
		
//		String path=context.getRealPath("/WEB-INF/classes/itcast.properties");
//		FileInputStream in=new FileInputStream(path);
//		Properties pros =new Properties();
//		pros.load(in);
//		out.println("Company="+pros.getProperty("Company")+"<br /> " );
//		out.println("Address="+pros.getProperty("Address"+"<br /> ") );
		
//		InputStream in=context.getResourceAsStream("/WEB-INF/classes/itcast.properties");  //getSourceAsStream 用相对路径
//		Properties pros=new Properties();
//		pros.load(in);
//		out.println(pros.getProperty("Company") );
//		out.println(pros.getProperty("Address"));

		String path=context.getRealPath("/WEB-INF/classes/itcast.properties");  //路径获得的绝对路径
		FileInputStream in=new FileInputStream(path);  
		
		
		Properties pros=new Properties();   //Map接口中，一个
		pros.load(in);
		out.println(pros.getProperty("Company"));
		out.println(pros.getProperty("Address"));
		
		Set path2=context.getResourcePaths("/WEB-INF");
		out.println(path2);
		
		
		URL url=context.getResource("/WEB-INF/classes/");
		out.print(url);
		
	}
	protected void doPost(HttpServletRequest requests,HttpServletResponse response)throws ServletException,IOException{
		this.doGet(requests, response);
	}

}

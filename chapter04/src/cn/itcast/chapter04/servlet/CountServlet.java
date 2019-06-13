package cn.itcast.chapter04.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class CountServlet extends HttpServlet{
	public static int num=0;
	
	
	public CountServlet() {
		System.out.println("这是构造方法");  //构造方法比初始化先调用，但是初始化更有用，后期会用到配置参数
	}
	
	public void init(ServletConfig arg0)throws ServletException{  //初始化方法，需要配置参数
		System.out.println("现在正在初始化");
	}
	
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{
			num+=1;
			System.out.println(num);
			PrintWriter out=response.getWriter();
			out.print(num);
//			out.write(num); 此方法会下载Count
			
	}
	public void destroy() {    // 破坏方法，不需要参数
		System.out.println("Servlet容器已被摧毁");
	}
	

}

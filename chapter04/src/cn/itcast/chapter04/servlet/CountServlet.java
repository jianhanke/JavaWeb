package cn.itcast.chapter04.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class CountServlet extends HttpServlet{
	public static int num=0;
	
	
	public CountServlet() {
		System.out.println("���ǹ��췽��");  //���췽���ȳ�ʼ���ȵ��ã����ǳ�ʼ�������ã����ڻ��õ����ò���
	}
	
	public void init(ServletConfig arg0)throws ServletException{  //��ʼ����������Ҫ���ò���
		System.out.println("�������ڳ�ʼ��");
	}
	
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{
			num+=1;
			System.out.println(num);
			PrintWriter out=response.getWriter();
			out.print(num);
//			out.write(num); �˷���������Count
			
	}
	public void destroy() {    // �ƻ�����������Ҫ����
		System.out.println("Servlet�����ѱ��ݻ�");
	}
	

}

package cn.itcast.chapter05.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.fastinfoset.sax.Properties;

import jdk.nashorn.internal.runtime.Property;
import java.io.*;
/**
 * Servlet implementation class RequestBodyServlet
 */
public class RequestBodyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		InputStream in =request.getInputStream();
		byte[] buffer=new byte[1024];
		StringBuilder sb=new StringBuilder();
		int len;
		while((len=in.read(buffer))!=-1) {
			sb.append(new String(buffer,0,len,"UTF-8"));
		}
		System.out.println(sb);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

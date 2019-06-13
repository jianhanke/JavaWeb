package cn.itcast.chapter05.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.serialize.Printer;

/**
 * Servlet implementation class RequestServlet
 */
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("getMethod:"+request.getMethod()+" <br>" );
		out.println("getRequestURI:"+request.getRequestURI()+" <br>");
		out.print("getQueryString:"+request.getQueryString()+" <br>" );
		out.println("getProtocol:"+request.getProtocol()+" <br>");
		out.println("getContextPath:"+request.getContextPath()+" <br>");
		out.println("getPathInfo:"+request.getPathInfo()+" <br>");
		out.println("getPathTranslated:"+request.getPathTranslated()+" <br>");
		out.println("getServletPath:"+request.getServletPath()+" <br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

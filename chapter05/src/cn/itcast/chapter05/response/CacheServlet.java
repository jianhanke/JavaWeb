package cn.itcast.chapter05.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CacheServlet
 */
public class CacheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8"); 
        response.setDateHeader("Expires",0);
        response.setHeader("Cache-Control","no-cache"); 
        response.setHeader("Pragma","no-cache");  
		PrintWriter out = response.getWriter();
		out.println("������Ӧ�������Ϊ��" + Math.random());
		out.println("<form action='NotServlet'" + "method='POST'>" +
			"��һ��������<input type='text' name='p1'><br>" +
			"�ڶ���������<textarea name='p2'></textarea><br>" +
			"<input type='submit' value='�ύ'> " +
			"</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

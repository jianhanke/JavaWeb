package cn.itcast.chapter06.session.exampl01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ListBookServlet
 */
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Collection<Book> books=BookDB.getAll();
		out.println("��վ�ṩ��ͼ����:<br> ");
		for (Book book : books) {
			String url="/chapter06/PurchaseServlet?id="+book.getId();
			out.write(book.getName()+"<a href='"+url+"'>�������</a><br>");
//			String url="/chapter06/PurchaseServlet?id="+book.getId();
//			HttpSession s=request.getSession();
//			String newUrl=response.encodeRedirectURL(url);
//			out.write(book.getName()+"<a href='"+newUrl+"'>�������</a><br>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

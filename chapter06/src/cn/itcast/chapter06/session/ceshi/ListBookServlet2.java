package cn.itcast.chapter06.session.ceshi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.chapter06.session.exampl01.Book;
import cn.itcast.chapter06.session.exampl01.BookDB;

/**
 * Servlet implementation class ListBookServlet2
 */
public class ListBookServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			Collection<Book2> books=BookDB2.getAll();
			
			
			Cookie[] cookies=request.getCookies();
			for(int i=0;i<cookies.length;i++) {
				String value=cookies[i].getValue();
				out.println(value+"测试换行,换行s");
			}
			
			out.println("一共有一22下几本书<br>");
			for(Book2 book : books) {
				String url="/chapter06/PurchaseServlet2?id="+book.getId();
				out.print(book.getName()+"<a href='"+url+" ' > 点击购买</a><br>" );
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

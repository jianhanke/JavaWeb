package cn.itcast.chapter06.session.ceshi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.itcast.chapter06.session.exampl01.Book;

/**
 * Servlet implementation class CartServlet2
 */
public class CartServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		List<Book2> cart =null;
		boolean purFlag=true;
		HttpSession session=request.getSession(true);
		if(session==null) {
			purFlag=true;
		}else {
			cart=(List)session.getAttribute("cart");
			if(cart==null) {
				purFlag=false;
			}
		}
		if(!purFlag) {
			out.write("对不起!你没有购买任何东西");
		}else {
			out.write("您购买的图书有 <br>");
			for(Book2 book:cart) {
				out.write(book.getName()+" <br>" );
			}
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

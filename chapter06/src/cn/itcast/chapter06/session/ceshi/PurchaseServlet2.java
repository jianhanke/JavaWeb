package cn.itcast.chapter06.session.ceshi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import cn.itcast.chapter06.session.exampl01.Book;
import cn.itcast.chapter06.session.exampl01.BookDB;

/**
 * Servlet implementation class PurchaseServlet2
 */
public class PurchaseServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String id=request.getParameter("id");
			if(id==null) {
				String url="/chapter06/ListBookServlet2";
				 response.sendRedirect(url);
				 return;
			}
			Book2 book=BookDB2.getBook(id);
			HttpSession session= request.getSession();

			List<Book2> cart=(List<Book2>) session.getAttribute("cart");
			if(cart==null) {
				cart=new ArrayList<Book2>();
				session.setAttribute("cart", cart);
			}
		
			
			cart.add(book);
			Cookie cookie=new Cookie("JESSIONID",session.getId());
			cookie.setMaxAge(3600);
			cookie.setPath("/chapter06");
			response.addCookie(cookie);
			String url="/chapter06/CartServlet2";
			response.sendRedirect(url);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package cn.itcast.chapter06.session.exampl01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class PurchaseServlet
 */
public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String id=request.getParameter("id");
			if(id==null) {
				String url="/chapter06/ListBookServlet";
				response.sendRedirect(url);
				return;
			}
			Book book=BookDB.getBook(id);
			HttpSession session=request.getSession(true);
			List<Book> cart=(List<Book>) session.getAttribute("cart");  //获取session里的cart
			if(cart==null) {                                       //判断是否是新创建的session
				cart=new ArrayList<Book>();
				session.setAttribute("cart", cart);
			}
			cart.add(book);                                       
			Cookie cookie=new Cookie("JSESSIONID",session.getId());
			cookie.setMaxAge(3600);                                     
			cookie.setPath("/chapter06");                        
			response.addCookie(cookie);                           
			String url="/chapter06/CartServlet";
			response.sendRedirect(url);                             
//			String newurl=response.encodeRedirectURL(url);
//			response.sendRedirect(newurl);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

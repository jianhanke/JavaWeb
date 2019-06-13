package cn.itcast.chapter06.cookie.example;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LastAccessServlet
 */
public class LastAccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html;charset=utf-8");
			String lastAccessTime=null;
//			response.getWriter().print(lastAccessTime.getClass().toString());
			Cookie[] cookies=request.getCookies();
			for (int i=0;cookies!=null && i<cookies.length;i++) {
				if("lastAccess".equals(cookies[i].getName())) {
					lastAccessTime=cookies[i].getValue();
					break;
				}
			}
			if(lastAccessTime==null) {
				
				response.getWriter().print("你是首次访问本站点");
			}else {
				response.getWriter().print("你上次访问的时间是"+lastAccessTime);
			}
			String currenttime =new SimpleDateFormat("hh:mm:ss").format(new Date());
			System.out.println(currenttime);
			
			Cookie cookie=new Cookie("lastAccess",currenttime);
		
			cookie.setMaxAge(-1);
			cookie.setPath("/chapter06");
			Cookie cookie2=new Cookie("lastAccess2","这是歌测试");
			System.out.println("测试11");
			response.addCookie(cookie);
			response.addCookie(cookie2);
			response.getWriter().println();
			System.out.println("测试");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

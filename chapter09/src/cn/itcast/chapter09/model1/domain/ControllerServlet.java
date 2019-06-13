package cn.itcast.chapter09.model1.domain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
    }
    
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");	
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		DBUtil dbUtil=DBUtil.getInstance();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String password2=request.getParameter("password2");
		String email=request.getParameter("email");
		

		UserBean user=new UserBean();
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		
		RegisterFormBean register=new RegisterFormBean();
		register.setName(name);
		register.setPassword(password);
		register.setPassword2(password2);
		register.setEmail(email);
		System.out.println("ceshi");
		if(!register.validate()) {

			request.setAttribute("register", register);
			request.getRequestDispatcher("register.jsp").forward(request, response);
			return ;
			
		}
		if(!dbUtil.insertUser(user)) {
			register.setErrors("dbError", "该用户已经被注册过");
			request.setAttribute("register", register);
			request.getRequestDispatcher("register.jsp").forward(request, response);
			return ;
		}else {
			response.getWriter().print("恭喜你注册成功,1秒后自动跳转");
			request.getSession().setAttribute("user", user);
//			response.setHeader("refresh", "1;url=loginSuccess.jsp");
//			response.sendRedirect("/chapter09/loginSuccess.jsp");
			request.getRequestDispatcher("/loginSuccess.jsp").forward(request, response);
//			response.setHeader("refresh", "1");
		}
		
	}


	

}

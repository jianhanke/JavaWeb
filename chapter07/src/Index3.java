

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index3
 */
public class Index3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Servlet û��PageContext
		
		response.getWriter().println(request.getAttribute("request"));
		response.getWriter().println(request.getSession().getAttribute("session"));
		response.getWriter().println(getServletContext().getAttribute("application"));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	static {
		System.out.println("Servlet����ʾ��������, ����<load-on-startup>��ֵ>=0 ,������servlet��������ʱ���漴��ʼ����ֵԽС��Խ�ȱ�����.  ֵ<0 ���ᱻ���ء�ֻ�ܶ�Servlet ��Jsp�ļ������  ");	
	}

}

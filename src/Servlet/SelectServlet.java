package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Course;
import Dao.CourseDao;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		List<Course> L = null;
		if(type.equals("1")){
			L = new CourseDao().ListCourseByRenQi1();
		}else if(type.equals("2")){
			L = new CourseDao().ListCourseByRenQi2();
		}else if(type.equals("3")){
			L = new CourseDao().ListCourseByCost1();
		}else if(type.equals("4")){
			L = new CourseDao().ListCourseByCost2();
		}else if(type.equals("5")){
			String name = request.getParameter("name");
			L = new CourseDao().ListCourseByType(name);
		}else if(type.equals("6")){
			String name = request.getParameter("name");
			L = new CourseDao().ListCourseByLaiYuan(name);
		}
		request.setAttribute("courses", L);
		request.getRequestDispatcher("kecheng.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

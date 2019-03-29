package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.User;
import Dao.UserDao;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mail = request.getParameter("mail");
		String xingming = request.getParameter("xingming");
		String xingbie = request.getParameter("xingbie");
		String nianji = request.getParameter("nianji");
		String qq = request.getParameter("qq");
		String shouji = request.getParameter("shouji");
		String nichen = request.getParameter("nichen");
		System.out.println(mail);
		User u = new UserDao().getUser(mail);
		if(nianji!=null||!nianji.equals(""))u.setNianji(nianji);
		if(shouji!=null||!shouji.equals(""))u.setPhone(shouji);
		if(qq!=null||!qq.equals(""))u.setQq(qq);
		if(xingbie!=null||!xingbie.equals(""))u.setXingbie(xingbie);
		if(xingming!=null||!xingming.equals(""))u.setXingming(xingming);
		if(nichen!=null||!nichen.equals("")) u.setName(nichen);
		new UserDao().updateUser(u);
		request.getSession().setAttribute("user", u);
		PrintWriter out = response.getWriter();
		String a = URLEncoder.encode("修改信息成功", "UTF-8"); 
		out.print("<script>alert(decodeURIComponent('"+a+"'));window.location.href='User.jsp'</script>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

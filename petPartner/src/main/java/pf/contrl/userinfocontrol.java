package pf.contrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import User.User;
import pf.services.loginservices;
import pf.services.impl.loginservicesimpl;

@WebServlet("/myinfo")
public class userinfocontrol extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private loginservices loginService = new loginservicesimpl();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  doPost(req,resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uid = request.getParameter("uid");
		User user=new User();
		int id=0;
		try {
		   id=Integer.parseInt(uid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		user.setId(id);
		user = loginService.getuserserviceinuser3(user);
		HttpSession session = request.getSession(); // 获取session对象
		session.setAttribute("user",user );
		response.sendRedirect("User3.jsp");
	}
	
	
	
}

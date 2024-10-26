package pf.contrl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import User.User;
import pf.services.loginservices;
import pf.services.impl.loginservicesimpl;

@WebServlet("/managerusercontrol")
public class managerusercontrol extends HttpServlet{

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
		List<User> users=new ArrayList<User>();
		users = loginService.getuserservice();
		HttpSession session = request.getSession(); 
		session.setAttribute("users",users);
		response.sendRedirect("manager.jsp");	
		
	}
}

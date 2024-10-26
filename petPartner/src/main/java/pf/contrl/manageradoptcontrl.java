package pf.contrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import aopt.adopt;
import pf.services.manageradoptservice;
import pf.services.impl.manageradoptserviceimpl;
@WebServlet("/manageradoptcontrol")
public class manageradoptcontrl extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private manageradoptservice manageradoptService = new manageradoptserviceimpl();

	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  doPost(req,resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		List<adopt> adoptinfolist=manageradoptService.getadoptlist();
		HttpSession session = request.getSession(); 
		session.setAttribute("adoptinfolist",adoptinfolist);
		response.sendRedirect("manager3.jsp");	
	}


}

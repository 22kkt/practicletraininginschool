package pf.contrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import foster.foster;
import pf.services.managerfosterservice;
import pf.services.impl.managerfosterserviceimpl;



@WebServlet("/managerfostercontrol")
public class managerfostercontrl extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
    private managerfosterservice managerfosterService=new managerfosterserviceimpl();	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  doPost(req,resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		List<foster> fosterinfoList = managerfosterService.getfosterinfo();
		HttpSession session = request.getSession(); 
		session.setAttribute("fosterinfoList",fosterinfoList);
		response.sendRedirect("manager4.jsp");	
			
	}

}

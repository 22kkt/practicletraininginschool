package pf.contrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pet.Pet;
import pf.services.petinfoservices;
import pf.services.impl.petinfoservicesimpl;



@WebServlet("/petinfo")
public class petinfocontrol extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private petinfoservices  petinfoServices= new petinfoservicesimpl();

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
	
		String pid= request.getParameter("pet");
		Pet petinfo = petinfoServices.getpetinfo(Integer.parseInt(pid));
		request.setAttribute("petinfo", petinfo);
		request.getRequestDispatcher("petinfo.jsp").forward(request, response);
	}
	
	
	

}

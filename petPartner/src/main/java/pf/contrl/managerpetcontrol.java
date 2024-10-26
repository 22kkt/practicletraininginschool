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

import pet.Pet;
 import pf.services.petinfoservices;
 import pf.services.impl.petinfoservicesimpl;

@WebServlet("/managerpetcontrol")
public class managerpetcontrol extends HttpServlet {
	
	private static final long serialVersionUID = 1L;	
	private petinfoservices petinfoService = new petinfoservicesimpl();

	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  doPost(req,resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		List<Pet> petslist=new ArrayList<Pet>();
		petslist = petinfoService.getpet();
		HttpSession session = request.getSession(); 
		session.setAttribute("petslist",petslist);
		response.sendRedirect("manager2.jsp");	
	}

}

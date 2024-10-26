package pf.contrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pf.services.changeinfoservice;
import pf.services.impl.changeinfoserviceimpl;


@WebServlet("/changeuserinfo")
public class changeuserinfocontrol extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private changeinfoservice changeinfoservice=new changeinfoserviceimpl();	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  doPost(req,resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String changetype = request.getParameter("inputSpecies");
		String value= request.getParameter("value");
		String uid= request.getParameter("id");
		int id=Integer.parseInt(uid);
		if(changetype=="manager") {
			int valuenum=Integer.parseInt(value);
			changeinfoservice.changeinfo(valuenum,id);
		}else {
			changeinfoservice.changeinfo(changetype,value,id);
		}
		request.getRequestDispatcher("managerusercontrol").forward(request, response);			
		
	}
}

package pf.contrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pf.services.changepetinfoservice;
import pf.services.impl.changepetinfoserviceimpl;
@WebServlet("/changepetinfo")
public class changepetinfocontrol extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
private changepetinfoservice changepetinfoservice=new changepetinfoserviceimpl();	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  doPost(req,resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String changetype = request.getParameter("inputSpecies");
		String value= request.getParameter("value");
		String pid= request.getParameter("id");
		int id=Integer.parseInt(pid);
	
		if(changetype.equals("sex")) {
			int valuenum=Integer.parseInt(value);
			changepetinfoservice.changepetinfo(valuenum,id);
		}else {
			changepetinfoservice.changepetinfo(changetype,value,id);
		}
		request.getRequestDispatcher("managerpetcontrol").forward(request, response);			
		
	}
}

package pf.contrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pf.services.changeadoptinfoservice;
import pf.services.impl.changeadoptinfoserviceimpl;
@WebServlet("/changeadoptinfo")
public class changeadoptinfocontrol extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private changeadoptinfoservice changeadoptinfoService = new changeadoptinfoserviceimpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  doPost(req,resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String changetype = request.getParameter("inputSpecies");
		String value= request.getParameter("value");
		String aid= request.getParameter("id");
		int id=Integer.parseInt(aid);
		
	
		if(changetype.equals("status")) {
			int valuenum=Integer.parseInt(value);
			changeadoptinfoService.changeadoptinfo(valuenum,id);
		}else {
			changeadoptinfoService.changeadoptinfo(changetype,value,id);
		}
		request.getRequestDispatcher("manageradoptcontrol").forward(request, response);			
		
	}

}

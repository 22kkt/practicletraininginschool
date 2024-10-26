package pf.contrl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pf.services.changefosterservice;
import pf.services.impl.changefosterserviceimpl;

@WebServlet("/changefoster")
public class changefostercontrl extends HttpServlet{
/**
 * 
 */
private static final long serialVersionUID = 1L;
private changefosterservice changefosterService = new changefosterserviceimpl();

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  doPost(req,resp);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	
	String changetype = request.getParameter("inputSpecies");
	String value= request.getParameter("value");
	String aid= request.getParameter("id");
	int id=Integer.parseInt(aid);	
	if(changetype.equals("fostertime")||changetype.equals("backtime")) {
		try {
			SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date date = outputFormat.parse(value);
	        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			changefosterService.changedate(changetype,sqlDate,id);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}else if(changetype.equals("status")){
		int values=Integer.parseInt(value);
		changefosterService.changestatus(changetype,values,id);
	}else {
		changefosterService.changespecies("petspecies",value,id);
	}
	request.getRequestDispatcher("managerfostercontrol").forward(request, response);	
}

}

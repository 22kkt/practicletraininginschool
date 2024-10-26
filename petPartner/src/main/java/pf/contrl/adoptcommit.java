package pf.contrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pf.services.adoptservice;
import pf.services.impl.adoptserviceimpl;


@WebServlet("/adoptcommit")
public class adoptcommit extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private adoptservice adoptService=new adoptserviceimpl();
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		String petid= request.getParameter("petid");
		String userid= request.getParameter("userid");
		
		adoptService.commit(Integer.parseInt(petid),Integer.parseInt(userid));
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}

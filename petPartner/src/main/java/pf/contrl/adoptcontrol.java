package pf.contrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pet.Pet;
import pf.services.adoptservice;
import pf.services.impl.adoptserviceimpl;


@WebServlet("/adopt")
public class adoptcontrol extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private adoptservice adoptservice = new adoptserviceimpl();
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

		//        response.setCharacterEncoding("UTF-8");
//
//		List<Pet> petList = adoptservice.getpetlist();		
//        HttpSession session= request.getSession();
//        session.setAttribute("petlist",petList);
		// 设置响应内容类型
        //response.setContentType("application/json");		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
        response.setCharacterEncoding("UTF-8");
		List<Pet> petList = adoptservice.getpetlist();		
        HttpSession session= request.getSession();
        session.setAttribute("petlist",petList);
		request.getRequestDispatcher("adopt.jsp").forward(request, response);
		
	}

}
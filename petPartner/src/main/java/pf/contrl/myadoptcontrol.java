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
import pf.services.myadoptservices;
import pf.services.impl.myadoptservicesimpl;

@WebServlet("/myadopt")
public class myadoptcontrol extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private myadoptservices myadoptServices=new myadoptservicesimpl();
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  doPost(req,resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uid = request.getParameter("uid");
		int id=0;
		try {
			id=Integer.parseInt(uid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		List<Pet> mypet =new ArrayList<Pet>();
		mypet=myadoptServices.getmypetlist(id);
		HttpSession session = request.getSession(); // 获取session对象
		session.setAttribute("mypet",mypet );
		response.sendRedirect("User.jsp");
		
	}
	
	
	

}

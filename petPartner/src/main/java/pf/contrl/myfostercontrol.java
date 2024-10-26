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

import foster.foster;
import pf.services.fosterservices;
import pf.services.impl.fosterservicesimpl;

@WebServlet("/myfoster")
public class myfostercontrol extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private fosterservices fosterService=new fosterservicesimpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		/*
		 * ① 获取当前用户的id
		 * ② 要service根据id来查询到当前用户对象
		 * ③ 把用户对象存入reqeust对象，并跳转到用户详情页面
		 */
		String uid = request.getParameter("uid");
		List<foster> myfoster=new ArrayList<foster>();
		int id=Integer.parseInt(uid);
		myfoster=fosterService.getfoster(id);
		HttpSession session = request.getSession(); // 获取session对象
		session.setAttribute("myfoster",myfoster);
		request.getRequestDispatcher("User2.jsp").forward(request, response);
	
	}

	
	
}

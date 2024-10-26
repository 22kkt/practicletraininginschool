package pf.contrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import User.User;
import pf.services.loginservices;
import pf.services.impl.loginservicesimpl;

@WebServlet("/login")
public class logincontrol extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private loginservices loginService = new loginservicesimpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  doPost(req,resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * ① 获取用户登录信息(参数)
		 * ② 调用services层要他去判断当前登录信息是否能够登录
		 *       true:  能登录
		 *       false:   不能登录
		 * ③ 根据boolean结果进行页面跳转
		 */
		request.setCharacterEncoding("UTF-8");
		String tel = request.getParameter("tel");
		String password = request.getParameter("password");
		User user = new User(tel,password);
		user.setTel(tel);
		user.setPassword(password);
		int result = loginService.login(user);
		if(result>0) {

			// 首页
			// 把用户名存入到session会话对象中
			HttpSession session = request.getSession(); // 获取session对象
			session.setAttribute("tel",tel );
			
			user = loginService.getuserservice(user);
			int usermanager=user.getManager();
			int id = result;
			session.setAttribute("user",user);
			session.setAttribute("id",id);
			session.setAttribute("usermanager",usermanager);
			response.sendRedirect("index.jsp");
			
		}else {
			// 登录页面进行提示
			request.setAttribute("info", "用户名或密码错误!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}
	
	
}

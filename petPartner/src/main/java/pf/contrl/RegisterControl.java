package pf.contrl;

import User.User;

import java.io.IOException;
import pf.services.RegisterServices;
import pf.services.impl.RegisterServicesImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterControl extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 创建service接口对象
	private RegisterServices userService = new RegisterServicesImpl();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 乱码处理
		request.setCharacterEncoding("UTF-8");
		/*
		 * ① 接收用户的注册信息(参数)
		 * ② 把参数传给services要他帮你去完成注册的业务
		 * ③ 接收到services的反馈结果
		 *        true: 注册成功 ，跳转到首页
		 *        false: 注册失败，跳回到注册页面，并提示注册失败原因
		 */
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String idno = request.getParameter("idno");
		String city = request.getParameter("city");
		User user = new User(name,tel,email,password,idno,city);
		
	
		// 调用service完成业务处理得到结果
		boolean result = userService.register(user);
		
		/*
		 * 页面间跳转：
		 *     重定向：相当于在浏览器中写上一个新url,url地址会发生改变,不会附带参数
		 *     请求转发：url地址不会发生改变，能够传递参数
		 */
		if(result) {
			//  重定向 首页
			request.setAttribute("info", "注册成功，将进入登录页面");
			response.sendRedirect("login.jsp");
		}else {
			// 请求转发 注册页面 并提示
			request.setAttribute("info", "网络异常，请重新注册!");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		}
	}
	
	

}

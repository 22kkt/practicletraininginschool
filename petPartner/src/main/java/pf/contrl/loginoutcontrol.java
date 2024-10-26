package pf.contrl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;



@WebServlet("/loginout")
public class loginoutcontrol extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		HttpSession session =  request.getSession();
		session.removeAttribute("tel");
		session.removeAttribute("usermanager");
		session.removeAttribute("user");
		session.removeAttribute("id");
		session.removeAttribute("usermanager");
		response.sendRedirect("index.jsp");
	}

}

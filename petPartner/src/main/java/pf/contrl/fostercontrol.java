package pf.contrl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import foster.foster;
import pf.services.fosterservices;
import pf.services.impl.fosterservicesimpl;

@WebServlet("/fostercommit")
public class fostercontrol extends HttpServlet{

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
		String name = request.getParameter("inputUserName4");
		String tel = request.getParameter("inputTel4");
		String ftime = request.getParameter("inputDate4");
		String btime = request.getParameter("inputDate");
		String species=request.getParameter("inputSpecies");
		Date ftime1=new Date();
		Date btime1=new Date();
		int id=0;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			btime1 = sdf.parse(btime);
		    ftime1= sdf.parse(ftime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String userid=request.getParameter("sessionValueField");

            id = Integer.parseInt(userid);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
		System.out.println(id);
       // 将 java.util.Date 转换为 java.sql.Dat
        java.sql.Date fostertime = new java.sql.Date(ftime1.getTime());
        java.sql.Date backtime = new java.sql.Date(btime1.getTime());
		foster fosterinfo= new foster(id,name,tel,species,fostertime,backtime);
		int i=fosterService.fostercommit(fosterinfo);
		if(i>0) {
		request.getRequestDispatcher("foster.jsp").forward(request, response);
		}
	}
	
	

}

package pf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import foster.foster;
import pf.dao.fosterdao;
import util.JDBCUtil;

public class fosterdaoimpl implements fosterdao {
	public int fostercommit(foster fosterinfo) {
		
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "insert into foster(userId,userTel,fostertime,takebacktime,petspecies) value(?,?,?,?,?)";
		try {
			//System.out.println(fosterinfo.getId());
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, fosterinfo.getId());
			pstmt.setString(2, fosterinfo.getTel());
			pstmt.setDate(3, fosterinfo.getFostertime());
			pstmt.setDate(4, fosterinfo.getBacktime());
			pstmt.setString(5, fosterinfo.getSpecie());
			int i = pstmt.executeUpdate();
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		return 1;
	}

	@Override
	public List<foster> getfoster(int id) {
		// TODO Auto-generated method stub
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "select userTel,fostertime,takebacktime,petspecies from foster where userId=?";
		List<foster> myfoster=new ArrayList<foster>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String tel=rs.getString("userTel");
				java.sql.Date ftime=rs.getDate("fostertime");
				java.sql.Date ttime=rs.getDate("takebacktime");
				String pspecie=rs.getString("petspecies");
				foster fosterinfo = new foster(tel,pspecie,ftime,ttime);
				myfoster.add(fosterinfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		return myfoster;
	}
}

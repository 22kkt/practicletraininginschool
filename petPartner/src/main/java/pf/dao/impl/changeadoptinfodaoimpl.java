package pf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pf.dao.changeadoptinfodao;
import util.JDBCUtil;

public class changeadoptinfodaoimpl implements changeadoptinfodao {

	@Override
	public void changeadoptinfo(int valuenum, int id) {
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "update adopt set status= ? where aid=?";
		try { 
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, valuenum);
			pstmt.setInt(2, id);
			int i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		
	}

	@Override
	public void changeadoptinfo(String changetype, String value, int id) {
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "update adopt set "+changetype+"= ? where aid=?";
		try { 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, value);
			pstmt.setInt(2, id);
			int i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		
	}
	

}

package pf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pf.dao.changepetinfodao;
import util.JDBCUtil;

public class changepetinfodaoimpl implements changepetinfodao {

	public void changepetinfo(int valuenum, int id) {
		// TODO Auto-generated method stub
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "update pet set sex= ? where id=?";
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

	public void changepetinfo(String changetype, String value, int id) {
		// TODO Auto-generated method stub
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "update pet set "+changetype+"= ? where id=?";
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

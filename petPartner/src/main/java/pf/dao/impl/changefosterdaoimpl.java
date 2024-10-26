package pf.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pf.dao.changefosterdao;
import util.JDBCUtil;

public class changefosterdaoimpl implements changefosterdao {

	@Override
	public void changedate(String changetype, java.sql.Date value, int id) {
		if(changetype.equals("backtime")) {
			changetype="takebacktime";
		}
		// TODO Auto-generated method stub
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "update foster set "+changetype+"= ? where id=?";
		try { 
			pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, value);
			pstmt.setInt(2, id);
			int i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		
	}

	@Override
	public void changestatus(String changetype, int value, int id) {
		// TODO Auto-generated method stub
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "update foster set "+changetype+"= ? where id=?";
		try { 
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, value);
			pstmt.setInt(2, id);
			int i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		
	}

	@Override
	public void changespecies(String changetype, String value, int id) {
		// TODO Auto-generated method stub
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "update foster set "+changetype+"= ? where id=?";
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

package pf.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import User.User;

import pf.dao.logindao;
import util.JDBCUtil;
public class logindaoimpl implements logindao {

	@Override
	public int login(User user) {
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		int uid = 0;
		String sql = "select id,city,email,idno,city from user where tel = ? and password = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getTel());
			pstmt.setString(2, user.getPassword());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				uid = rs.getInt("id");
				user.setCity(rs.getString("city"));
				user.setEmail(rs.getString("email"));
				user.setIdno(rs.getString("idno"));
				user.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		
		return uid;
	}

	public User getuserdao(User user) {
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "select id,city,email,idno,name,manager from user where tel = ? and password = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getTel());
			pstmt.setString(2, user.getPassword());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				user.setId(rs.getInt("id"));
				user.setManager(rs.getInt("manager"));
				user.setCity(rs.getString("city"));
				user.setEmail(rs.getString("email"));
				user.setIdno(rs.getString("idno"));
				user.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		
		return user;
	}

	@Override
	public User getuserdaoinuser3(User user) {
		// TODO Auto-generated method stub
		
		
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "select id,tel,city,email,idno,name from user where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, user.getId());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				user.setId(rs.getInt("id"));
				user.setTel(rs.getString("Tel"));
				user.setCity(rs.getString("city"));
				user.setEmail(rs.getString("email"));
				user.setIdno(rs.getString("idno"));
				user.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		
		return user;
	}

	@Override
	public List<User> getuserservice() {
		// TODO Auto-generated method stub
		List<User> users= new ArrayList<User>();
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "select id,tel,city,email,idno,name,manager from user";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				User user= new User();
				user.setId(rs.getInt("id"));
				user.setTel(rs.getString("Tel"));
				user.setCity(rs.getString("city"));
				user.setEmail(rs.getString("email"));
				user.setIdno(rs.getString("idno"));
				user.setName(rs.getString("name"));
				user.setManager(rs.getInt("manager"));
				users.add(user);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		return users;
	}

}

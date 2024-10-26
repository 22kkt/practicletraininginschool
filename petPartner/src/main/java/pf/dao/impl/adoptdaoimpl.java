package pf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pet.Pet;
import pf.dao.adoptdao;
import util.JDBCUtil;

public class adoptdaoimpl implements adoptdao {

	public List<Pet> getpetlist() {
		// TODO Auto-generated method stub		
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "select id,species,breed,sex,status,gender,img from pet limit 40";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			List<Pet> petlist = new ArrayList<Pet>();
			while(rs.next()) {
				int id=rs.getInt("id");
				String species = rs.getString("species");
				String breed = rs.getString("breed");
				int sex = rs.getInt("sex");
				String status = rs.getString("status");
				String gender = rs.getString("gender");
				String img = rs.getString("img");

				Pet pet = new Pet(id,species,breed,sex,status,gender,img);
				petlist.add(pet);
			}
			return petlist;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		return null;
	}

	@Override
	public void commit(int petid, int userid) {
		// TODO Auto-generated method stub
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "insert into adopt(pid,uid)value(?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, petid);
			pstmt.setInt(2, userid);

			int i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		
	}

}

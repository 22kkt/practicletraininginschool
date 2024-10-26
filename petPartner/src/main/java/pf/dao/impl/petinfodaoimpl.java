package pf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pet.Pet;
import pf.dao.petinfodao;
import util.JDBCUtil;

public class petinfodaoimpl implements petinfodao{

	@Override
	public Pet getpetinfo(int pid) {
		// TODO Auto-generated method stub
		Pet petinfo=new Pet();
		
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "select id,species,breed,sex,status,gender,img from pet where id = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,pid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				petinfo.setId(rs.getInt("id"));
				petinfo.setSpecies(rs.getString("species"));
				petinfo.setBreed(rs.getString("breed"));
				petinfo.setSex(rs.getInt("sex"));
				petinfo.setStatus(rs.getString("status"));
				petinfo.setGender(rs.getString("gender"));
				petinfo.setImg(rs.getString("img"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);

		}
		return petinfo;
	}

	@Override
	public List<Pet> getpet() {
		List<Pet> pets=new ArrayList<Pet>();
		
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "select id,species,breed,sex,status,gender,img from pet";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Pet petinfo=new Pet();
				petinfo.setId(rs.getInt("id"));
				petinfo.setSpecies(rs.getString("species"));
				petinfo.setBreed(rs.getString("breed"));
				petinfo.setSex(rs.getInt("sex"));
				petinfo.setStatus(rs.getString("status"));
				petinfo.setGender(rs.getString("gender"));
				petinfo.setImg(rs.getString("img"));
				pets.add(petinfo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);

		}
		return pets;
	}

}

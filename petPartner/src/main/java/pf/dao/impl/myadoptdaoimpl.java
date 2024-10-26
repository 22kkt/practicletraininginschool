package pf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pet.Pet;
import pf.dao.myadoptdao;
import util.JDBCUtil;

public class myadoptdaoimpl implements myadoptdao{

	@Override
	public List<Pet> getmypetlist(int uid) {
		// TODO Auto-generated method stub
		List<Pet> mypet=new ArrayList<Pet>();
		
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "select a.id,a.breed,a.sex,a.gender,a.status,a.img from pet a,adopt b where b.uid= ? and b.pid = a.id";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, uid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Pet pet= new Pet(rs.getInt("id"),rs.getString("breed"),rs.getInt("sex"),rs.getString("status"),rs.getString("gender"),rs.getString("img"));
				mypet.add(pet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		
		return mypet;
	}
		

}

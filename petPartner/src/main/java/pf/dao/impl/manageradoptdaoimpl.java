package pf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import aopt.adopt;
import pet.Pet;
import pf.dao.manageradpotdao;
import util.JDBCUtil;

public class manageradoptdaoimpl implements manageradpotdao{

	@Override
	public List<adopt> getadoptlist() {
		
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "select adopt.aid,user.id as uid,pet.id as pid,user.tel,pet.breed, adopt.status from pet,user,adopt where user.id=adopt.uid and pet.id=adopt.pid";
		List<adopt> adoptinfoList = new ArrayList<adopt>();
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				adopt aadopt=new adopt();
				aadopt.setId(rs.getInt("aid"));
				aadopt.setUid(rs.getInt("uid"));
				aadopt.setPid(rs.getInt("pid"));
				aadopt.setTel(rs.getString("tel"));
				aadopt.setBreed(rs.getString("breed"));
				aadopt.setStatus(rs.getString("status"));
				adoptinfoList.add(aadopt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);

		}
		return adoptinfoList;			

	}
	
	

}

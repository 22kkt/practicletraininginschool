package pf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import foster.foster;
import pf.dao.managerfosterdao;
import util.JDBCUtil;

public class managerfosterdaoimpl implements managerfosterdao{

	@Override
	public List<foster> getfosterinfo() {
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "select id,userTel,userId,fostertime,takebacktime,petspecies,status from foster ";
		List<foster> fosterlist = new ArrayList<foster>();
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			foster aFoster = new foster();
			while(rs.next()) {
				aFoster.setFid(rs.getInt("id"));
				aFoster.setId(rs.getInt("userId"));
				aFoster.setTel(rs.getString("userTel"));
				aFoster.setSpecie(rs.getString("petspecies"));
				aFoster.setStatus(rs.getInt("status"));
				aFoster.setFostertime(rs.getDate("fostertime"));
				aFoster.setBacktime(rs.getDate("takebacktime"));
				fosterlist.add(aFoster);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);

		}
		return fosterlist;		
	}

}

package pf.dao.impl;
import util.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import User.User;
import pf.dao.RegisterDao;

public class RegisterDaoImpl implements RegisterDao{
    @Override
	public int register(User user) {
		// 把user对象插入到users表中，然后返回插入结果
		Connection conn = JDBCUtil.getConn();
		PreparedStatement pstmt = null;
		String sql = "insert into user(name,tel,email,password,idno,city) value(?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getTel());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPassword());
			pstmt.setString(5, user.getIdno());
			pstmt.setString(6, user.getCity());
			int i = pstmt.executeUpdate();
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(null, pstmt, null);
		}
		return 1;
	}
}

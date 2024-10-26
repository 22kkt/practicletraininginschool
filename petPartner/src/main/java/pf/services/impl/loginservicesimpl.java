package pf.services.impl;
import java.util.List;

import User.User;
import pf.dao.logindao;
import pf.dao.impl.logindaoimpl;
import pf.services.loginservices;

public class loginservicesimpl implements loginservices{
	private logindao logindao = new logindaoimpl();

	@Override
	public int login(User user) {
		int uid = logindao.login(user);
		return uid;
	}

	@Override
	public User getuserservice(User user) {
		User user1=logindao.getuserdao(user);
		return user1;
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getuserserviceinuser3(User user) {
		// TODO Auto-generated method stub
		User auser=logindao.getuserdaoinuser3(user);
		return auser;
	}

	@Override
	public List<User> getuserservice() {
		// TODO Auto-generated method stub
		List<User> users=logindao.getuserservice();
		return users;
	}

}

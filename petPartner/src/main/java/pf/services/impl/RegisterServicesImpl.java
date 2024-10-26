package pf.services.impl;

import pf.dao.RegisterDao;
import pf.dao.impl.RegisterDaoImpl;
import User.User;
import pf.services.RegisterServices;

public class RegisterServicesImpl implements RegisterServices {
	private RegisterDao userDao = new RegisterDaoImpl();

	@Override
	public boolean register(User user) {
		int i = userDao.register(user);
		// 业务处理
		return i>0?true:false;
	}
}

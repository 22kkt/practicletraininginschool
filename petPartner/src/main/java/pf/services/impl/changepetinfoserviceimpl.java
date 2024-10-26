package pf.services.impl;

import pf.dao.changepetinfodao;
import pf.dao.impl.changepetinfodaoimpl;
import pf.services.changepetinfoservice;

public class changepetinfoserviceimpl implements changepetinfoservice {

	private changepetinfodao changeinfoDao=new changepetinfodaoimpl();
	public void changepetinfo(int valuenum ,int id) {
		// TODO Auto-generated method stub
		changeinfoDao.changepetinfo(valuenum,id);
		
	}

	@Override
	public void changepetinfo(String changetype, String value,int id) {
		// TODO Auto-generated method stub
		changeinfoDao.changepetinfo(changetype,value,id);
		
	}
}

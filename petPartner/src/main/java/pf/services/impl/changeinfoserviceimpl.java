package pf.services.impl;

import pf.dao.changeinfodao;
import pf.dao.impl.changeinfodaoimpl;
import pf.services.changeinfoservice;

public class changeinfoserviceimpl implements changeinfoservice {
	private changeinfodao changeinfoDao = new changeinfodaoimpl();
	@Override
	public void changeinfo(int valuenum ,int id) {
		// TODO Auto-generated method stub
		changeinfoDao.changeinfo(valuenum,id);
		
	}

	@Override
	public void changeinfo(String changetype, String value,int id) {
		// TODO Auto-generated method stub
		changeinfoDao.changeinfo(changetype,value,id);
		
	}
	

}

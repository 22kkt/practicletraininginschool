package pf.services.impl;

import pf.dao.changeadoptinfodao;
import pf.dao.impl.changeadoptinfodaoimpl;
import pf.services.changeadoptinfoservice;

public class changeadoptinfoserviceimpl implements changeadoptinfoservice{
	private changeadoptinfodao changeadoptinfoDao = new changeadoptinfodaoimpl();
	
	public void changeadoptinfo(int valuenum,int id) {
		// TODO Auto-generated method stub
		changeadoptinfoDao.changeadoptinfo(valuenum,id);
		
	}

	@Override
	public void changeadoptinfo(String changetype, String value, int id) {
		// TODO Auto-generated method stub
		changeadoptinfoDao.changeadoptinfo(changetype,value,id);
		
	}

}

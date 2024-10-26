package pf.services.impl;

import pf.dao.changefosterdao;
import pf.dao.impl.changefosterdaoimpl;
import pf.services.changefosterservice;

public class changefosterserviceimpl implements changefosterservice {
	private changefosterdao changefosterDao = new changefosterdaoimpl();

	
	
	public void changedate(String changetype, java.sql.Date value, int id) {
		// TODO Auto-generated method stub
		changefosterDao.changedate(changetype,value,id);
		
	}

	public void changestatus(String changetype, int value, int id) {
		// TODO Auto-generated method stub
		changefosterDao.changestatus(changetype,value,id);

		
	}
	public void changespecies(String changetype, String value, int id) {
		// TODO Auto-generated method stub
		changefosterDao.changespecies(changetype,value,id);

	}

}

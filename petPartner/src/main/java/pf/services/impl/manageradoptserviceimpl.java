package pf.services.impl;

import java.util.List;

import aopt.adopt;
import pf.dao.impl.manageradoptdaoimpl;
import pf.services.manageradoptservice;
import pf.dao.manageradpotdao;
public class manageradoptserviceimpl implements manageradoptservice {
	private manageradpotdao manageradoptDao = new manageradoptdaoimpl();
	@Override
	public List<adopt> getadoptlist() {
		// TODO Auto-generated method stub
		List<adopt> adoptinfoList = manageradoptDao.getadoptlist();
		return adoptinfoList;
	}

}

package pf.services.impl;

import java.util.List;

import foster.foster;
import pf.dao.managerfosterdao;
import pf.dao.impl.managerfosterdaoimpl;
import pf.services.managerfosterservice;

public class managerfosterserviceimpl implements managerfosterservice{
	private managerfosterdao managerfosterDao = new managerfosterdaoimpl();
	@Override
	public List<foster> getfosterinfo() {
		// TODO Auto-generated method stub
		List<foster> fosterinfo = managerfosterDao.getfosterinfo();
		return fosterinfo;
	}

}

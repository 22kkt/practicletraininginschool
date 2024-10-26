package pf.services.impl;

import java.util.List;

import foster.foster;
import pf.dao.fosterdao;
import pf.dao.impl.fosterdaoimpl;
import pf.services.fosterservices;

public class fosterservicesimpl implements fosterservices{
	private  fosterdao fosterDao = new fosterdaoimpl();
	
	public int fostercommit(foster fosterinfo) {
		// TODO Auto-generated method stub
		int i=fosterDao.fostercommit(fosterinfo);
		return i;
		
	}

	@Override
	public List<foster> getfoster(int id) {
		// TODO Auto-generated method stub
		List<foster> myfoster = fosterDao.getfoster(id);
		return myfoster;
	}

}

package pf.services.impl;

import java.util.List;

import pet.Pet;
import pf.dao.impl.petinfodaoimpl;
import pf.services.petinfoservices;

public class petinfoservicesimpl implements petinfoservices{
	private petinfodaoimpl petinfoDao = new petinfodaoimpl();
	@Override
	public Pet getpetinfo(int pid) {
		// TODO Auto-generated method stub
		Pet petinfo = petinfoDao.getpetinfo(pid);
		return petinfo;
	}
	@Override
	public List<Pet> getpet() {
		// TODO Auto-generated method stub
		List<Pet> pets=petinfoDao.getpet();
		return pets;
	}

}

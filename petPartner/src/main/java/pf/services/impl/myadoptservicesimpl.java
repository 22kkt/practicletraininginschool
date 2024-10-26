package pf.services.impl;

import java.util.List;

import pet.Pet;
import pf.dao.myadoptdao;
import pf.dao.impl.myadoptdaoimpl;
import pf.services.myadoptservices;

public class myadoptservicesimpl implements myadoptservices {
	private myadoptdao myadoptDao=new myadoptdaoimpl();
	@Override
	public List<Pet> getmypetlist(int id) {
		// TODO Auto-generated method stub
		List<Pet> myPets=myadoptDao.getmypetlist(id);
		return myPets;
	}

}

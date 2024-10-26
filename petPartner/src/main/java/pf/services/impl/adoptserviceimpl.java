package pf.services.impl;

import java.util.List;

import pet.Pet;
import pf.dao.adoptdao;
import pf.dao.impl.adoptdaoimpl;
import pf.services.adoptservice;

public class adoptserviceimpl implements adoptservice {
	private adoptdao adoptdao = new adoptdaoimpl();
	
	public List<Pet> getpetlist(){
		List<Pet> petList = adoptdao.getpetlist();
		return petList;
	}

	@Override
	public void commit(int petid, int userid) {
		// TODO Auto-generated method stub
		adoptdao.commit(petid,userid);
	}

}

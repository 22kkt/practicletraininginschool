package pf.services;

import java.util.List;

import pet.Pet;


public interface adoptservice {
	public List<Pet> getpetlist();
	public void commit(int petid,int userid);

}

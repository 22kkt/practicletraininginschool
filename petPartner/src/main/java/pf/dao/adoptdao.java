package pf.dao;


import java.util.List;


import pet.Pet;

public interface adoptdao {
	public List<Pet> getpetlist();
	public void commit(int petid,int userid);
}

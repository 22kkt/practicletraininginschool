package pf.dao;

import java.util.List;

import pet.Pet;

public interface petinfodao {
	public Pet getpetinfo(int pid);
	public List<Pet> getpet();

}

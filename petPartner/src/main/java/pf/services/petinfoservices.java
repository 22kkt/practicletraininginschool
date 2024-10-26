package pf.services;

import java.util.List;

import pet.Pet;

public interface petinfoservices {
	public Pet getpetinfo(int pid);
	public List<Pet> getpet();
}

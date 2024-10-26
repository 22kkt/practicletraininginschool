package pet;

public class Pet {
	private int id;
	private String species;
	private String breed;
	private int sex;
	private String gender;
	private String status;
	private String img;
	
	public Pet() {
		// TODO Auto-generated constructor stub
	}
	public Pet(int id,String species,String breed,int sex,String status,String gender,String img)
	{
		this.id = id;
		this.species=species;
		this.breed=breed;
		this.sex=sex;
		this.gender=gender;
		this.status=status;
		this.img=img;
	}
	public Pet(int id,String breed,int sex,String status,String gender,String img)
	{
		this.id = id;
		this.breed=breed;
		this.sex=sex;
		this.gender=gender;
		this.status=status;
		this.img=img;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	

}

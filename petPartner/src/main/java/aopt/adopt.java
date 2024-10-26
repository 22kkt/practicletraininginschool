package aopt;

public class adopt {
	private int id;
	private int uid;
	private int pid;
	private String tel;
	private String breed;
	private String status;
	
	
	public adopt() {
		
	}


	public adopt(int id,int uid, int pid, String tel, String breed, String status) {
		super();
		this.id = id;
		this.uid = uid;
		this.pid = pid;
		this.tel = tel;
		this.breed = breed;
		this.status = status;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	


}

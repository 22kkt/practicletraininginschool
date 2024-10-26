package foster;



public class foster {
	private int fid;
	private int id;
	private String name;
	private String tel;
	private String specie;
	private java.sql.Date fostertime;
	private java.sql.Date backtime;
	private int status;
	public foster() {
		
	}
	public foster(int id,String name, String tel, String specie, java.sql.Date fostertime, java.sql.Date backtime) {
		super();
		this.id=id;
		this.name = name;
		this.tel = tel;
		this.specie = specie;
		this.fostertime = fostertime;
		this.backtime = backtime;
	}
	
	public foster(String tel, String specie, java.sql.Date fostertime, java.sql.Date backtime) {
		this.tel = tel;
		this.specie = specie;
		this.fostertime = fostertime;
		this.backtime = backtime;
	}
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSpecie() {
		return specie;
	}
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	public java.sql.Date getFostertime() {
		return fostertime;
	}
	public void setFostertime(java.sql.Date fostertime) {
		this.fostertime = fostertime;
	}
	public java.sql.Date getBacktime() {
		return backtime;
	}
	public void setBacktime(java.sql.Date backtime) {
		this.backtime = backtime;
	}
	
	
	
	
	

	

}

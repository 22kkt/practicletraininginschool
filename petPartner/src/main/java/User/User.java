package User;

public class User{
	private int id;
	private String name;
	private String tel;
	private String email;
	private String password;
	private String idno;
	private String city;
	private int manager;
	
	public int getManager() {
		return manager;
	}


	public void setManager(int manager) {
		this.manager = manager;
	}


	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String name,String tel,String email,String password,String idno,String city){
		this.name=name;
		this.tel=tel;
		this.email=email;
		this.password=password;
		this.idno=idno;
		this.city=city;
	}
	public User(String tel,String password)
	{
		this.tel=tel;
		this.password=password;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getIdno() {
		return idno;
	}


	public void setIdno(String idno) {
		this.idno = idno;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
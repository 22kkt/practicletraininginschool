package pf.dao;

public interface changefosterdao {
	public void changedate(String changetype, java.sql.Date value, int id);
	public void changestatus(String changetype, int value, int id) ;
	public void changespecies(String changetype, String value, int id);

}

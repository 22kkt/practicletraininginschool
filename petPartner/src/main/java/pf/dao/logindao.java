package pf.dao;

import java.util.List;

import User.User;

public interface logindao {
	
	public int login(User user);
	public User getuserdao(User user);
	public User getuserdaoinuser3(User user);
	public List<User> getuserservice();
}

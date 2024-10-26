package pf.services;
import java.util.List;

import User.User;

public interface loginservices {
	public int login(User user);
	public User getuserservice(User user);
	public User getuserserviceinuser3(User user);
	public List<User> getuserservice();
}

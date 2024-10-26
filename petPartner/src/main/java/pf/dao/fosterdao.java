package pf.dao;

import java.util.List;

import foster.foster;

public interface fosterdao {
	public int fostercommit(foster fosterinfo);
	public List<foster> getfoster(int id);
}

package sn.senforage.dao;

import sn.senforage.domaine.User;

public interface IUser {
	
	public boolean verifyUser(String username, String password);
	
	public User getUser(String username);
}

package sn.senforage.dao;

import sn.senforage.domaine.User;

public interface IUser {
	public User getUser(String username, String password);
}

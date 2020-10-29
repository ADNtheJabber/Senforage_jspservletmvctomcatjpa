package sn.senforage.dao;

import sn.senforage.domaine.User;

public class UserDaoImpl implements IUser{

	@Override
	public User getUser(String username, String password) {
		return null;
		//return em.find(User.class, User.getUser_id);
	}

}

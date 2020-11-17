package sn.senforage.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sn.senforage.domaine.Client;
import sn.senforage.domaine.User;

public class UserDaoImpl implements IUser{
	
	private EntityManager em;

	public UserDaoImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("senforagePU");
		
		em = emf.createEntityManager();
	}

	@Override
	public boolean verifyUser(String username, String password) {
		try {
			
			Query query = em.createQuery("SELECT u FROM User u WHERE u.username=:username AND u.password=:password");
			
			query.setParameter("username", username);
			query.setParameter("password", password);
			
			if(query.getSingleResult() != null) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@Override
	public User getUser(String username) {
try {
			
			Query query = em.createQuery("SELECT u FROM User u WHERE u.username=:username");
			
			query.setParameter("username", username);
				return (User) query.getSingleResult();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

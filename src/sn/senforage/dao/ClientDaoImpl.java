package sn.senforage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sn.senforage.domaine.Client;

public class ClientDaoImpl implements IClient{

private EntityManager em;
	
	
	public ClientDaoImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("senforagePU");
		
		em = emf.createEntityManager();
	}

	@Override
	public Long add(Client client) {
		try {
			em.getTransaction().begin();
			em.persist(client);
			em.getTransaction().commit();
			
			return client.getClient_id();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}

	@Override
	public List<Client> listAll() {
		try {
			Query query = em.createQuery("SELECT c FROM client c");
		    return (List<Client>) query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Client getClient(Long id) {
		return em.find(Client.class, id);
	}

	@Override
	public void update(Client client) {
		try {
			em.getTransaction().begin();
			em.merge(client);
			em.getTransaction().commit();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Long id) {
		Client c = getClient(id);
	    if (c != null) {
	      em.remove(c);
	    }
	}

}

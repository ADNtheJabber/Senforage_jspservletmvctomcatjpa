package sn.senforage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sn.senforage.domaine.Village;

public class VillageDaoImpl implements IVillage{
	
	private EntityManager em;
	
	
	public VillageDaoImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("senforagePU");
		
		em = emf.createEntityManager();
	}

	@Override
	public Long add(Village village) {
		try {
			em.getTransaction().begin();
			em.persist(village);
			em.getTransaction().commit();
			
			return village.getVillage_id();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Village> listAll() {
		try {
			Query query = em.createQuery("SELECT v FROM Village v");
		    return query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Village getVillage(Long id) {
		return em.find(Village.class, id);
	}

	@Override
	public void delete(Long id) {
		Village v = getVillage(id);
	    if (v != null) {
	      em.remove(v);
	    }
	}

}

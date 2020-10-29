package sn.senforage.dao;

import java.util.List;

import sn.senforage.domaine.Village;

public interface IVillage {
	
	public Long add(Village village);
	
	public List<Village> listAll();
	
	public Village getVillage(Long id);
		
	public void delete(Long id);
}

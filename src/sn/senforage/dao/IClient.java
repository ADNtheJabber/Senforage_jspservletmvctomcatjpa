package sn.senforage.dao;

import java.util.List;

import sn.senforage.domaine.Client;

public interface IClient {
	public Long add(Client client);
	
	public List<Client> listAll();
	
	public Client getClient(Long id);
	
	public void update(Client client);
	
	public void delete(Long id);
}

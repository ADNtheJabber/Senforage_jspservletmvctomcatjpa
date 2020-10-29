package sn.senforage.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "village")
public class Village implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long village_id;
	
	@Column(nullable = false)
	private String nom;
	
	@Column(nullable = false)
	private String commune;
	
	@Column(nullable = false)
	private String region;
	
	@OneToMany(mappedBy = "village")
	private List<Client> clients;

	public Village() {
		super();
	}

	public Village(Long village_id, String nom, String commune, String region, List<Client> clients) {
		super();
		this.village_id = village_id;
		this.nom = nom;
		this.commune = commune;
		this.region = region;
		this.clients = clients;
	}

	public Long getVillage_id() {
		return village_id;
	}

	public void setVillage_id(Long village_id) {
		this.village_id = village_id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}

package sn.senforage.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "client", uniqueConstraints = {
	      						@UniqueConstraint(
	      								columnNames = {
	      										"cni"
	      								})
	    	   			}
		)
public class Client implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long client_id;
	
	@Column(name = "nom", length = 50)
	private String nom;
	
	@Column(name = "prenom", length = 50)
	private String prenom;
	
	@Column(name = "dateNaissance")
    private String dateNaiss;
	
	@Column(name = "lieuNaissance", length = 50)
	private String lieuNaiss;
	
	@Column(name = "cni", length = 50)
	private String cni;
	
	@Column(name = "email", length = 50)
	private String email;
	
	@Column(name = "tel", length = 20)
	private String tel;
	
	@ManyToOne
	@JoinColumn(name = "village_id")
	private Village village;

	public Client() {
		super();
	}

	public Client(Long client_id, String nom, String prenom, String dateNaiss, String lieuNaiss, String cni,
			String email, String tel, Village village) {
		super();
		this.client_id = client_id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.lieuNaiss = lieuNaiss;
		this.cni = cni;
		this.email = email;
		this.tel = tel;
		this.village = village;
	}

	public Long getClient_id() {
		return client_id;
	}

	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public String getLieuNaiss() {
		return lieuNaiss;
	}

	public void setLieuNaiss(String lieuNaiss) {
		this.lieuNaiss = lieuNaiss;
	}

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Village getVillage() {
		return village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

package sn.senforage.domaine;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "user", uniqueConstraints = {
		@UniqueConstraint(
				columnNames = {
						"username",
						"matricule",
						"email"
				})
}
)
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	
	@Column(name = "username", length = 30, nullable = false)
	private String username;
	
	@Column(name = "password", length = 30, nullable = false)
	private String password;
	
	@Column(name = "matricule", length = 30, nullable = false)
	private String matricule;
	
	@Column(name = "email", length = 30, nullable = false)
	private String email;
	
	@Column(name = "role", length = 25, nullable = false)
	private String role;
	
	
	public User() {
		super();
	}


	public User(Long user_id, String login, String password, String matricule, String email, String role) {
		super();
		this.user_id = user_id;
		this.username = login;
		this.password = password;
		this.matricule = matricule;
		this.email = email;
		this.role = role;
	}


	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

	
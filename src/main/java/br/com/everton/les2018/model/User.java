package br.com.everton.les2018.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends DomainEntity {
	
	private static final long serialVersionUID = 1L;
	private String username;
	private String idDocument;
	private String password;
	
	@ManyToOne(fetch = FetchType.EAGER,
			cascade = CascadeType.ALL)
	@JoinColumn(name = "user_role_id")
	private UserRole role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIdDocument() { return idDocument; }

	public void setIdDocument(String idDocument) {
		this.idDocument = idDocument;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}
}

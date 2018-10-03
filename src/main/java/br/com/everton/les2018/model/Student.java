package br.com.everton.les2018.model;

import javax.persistence.Entity;

@Entity
public class Student extends UserRole {

	private String roleName = "Student";

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}

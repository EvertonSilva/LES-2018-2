package br.com.everton.les2018.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("student")
public class Student extends UserRole {

	private static final long serialVersionUID = 1L;
	
}

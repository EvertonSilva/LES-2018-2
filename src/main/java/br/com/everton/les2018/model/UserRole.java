package br.com.everton.les2018.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class UserRole {
	
	private int loanDays;
	private int exemplarsAmount;
	
	public int getLoanDays() {
		return loanDays;
	}
	
	public int getExemplarsAmount() {
		return exemplarsAmount;
	}
	
}

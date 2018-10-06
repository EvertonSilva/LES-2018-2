package br.com.everton.les2018.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role_type")
public abstract class UserRole extends DomainEntity {
	
	private static final long serialVersionUID = 1L;
	private int loanDays;
	private int exemplarsAmount;
	
	public int getLoanDays() {
		return loanDays;
	}
	
	public int getExemplarsAmount() {
		return exemplarsAmount;
	}
	
}

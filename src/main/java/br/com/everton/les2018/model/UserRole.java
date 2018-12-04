package br.com.everton.les2018.model;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role_type")
public abstract class UserRole extends DomainEntity {
	
	private static final long serialVersionUID = 1L;
	private double loanDays;
	private int exemplarsAmount;

	@Column(name = "role_type", updatable = false, insertable = false)
	private String roleType;

	public String getRolyType() {
		return roleType;
	}
	
	public double getLoanDays() {
		return loanDays;
	}
	
	public int getExemplarsAmount() {
		return exemplarsAmount;
	}

}

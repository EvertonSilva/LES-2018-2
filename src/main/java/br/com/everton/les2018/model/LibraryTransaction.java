package br.com.everton.les2018.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class LibraryTransaction extends DomainEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private User user;
	
	@Embedded
	private DateRange period;

	public DateRange getPeriod() {
		return period;
	}

	public void setPeriod(DateRange period) {
		this.period = period;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

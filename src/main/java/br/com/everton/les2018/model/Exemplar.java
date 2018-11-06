package br.com.everton.les2018.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "exemplars")
public class Exemplar extends DomainEntity {
	
	private static final long serialVersionUID = 1L;
	

	private int number;
	private String shelfNumber;
	private ExemplarStatus status;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getShelfNumber() {
		return shelfNumber;
	}
	
	public void setShelfNumber(String shelfNumber) {
		this.shelfNumber = shelfNumber;
	}
	
	public ExemplarStatus getStatus() {
		return this.status;
	}
	
	public void setStatus(ExemplarStatus status) {
		this.status = status;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Exemplar other = (Exemplar) obj;
		
		if (this.shelfNumber == null) {
			if (other.getShelfNumber() != null)
				return false;
		} else if (!this.shelfNumber.equals(other.getShelfNumber()))
			return false;
		return true;
	}
	
	
	
}

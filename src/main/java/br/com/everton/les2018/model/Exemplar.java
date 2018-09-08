package br.com.everton.les2018.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "exemplars")
public class Exemplar extends DomainEntity {
	
	private static final long serialVersionUID = 1L;

	@NotBlank
	private int number = 1;
	
	@NotBlank
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
	
}

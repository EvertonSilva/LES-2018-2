package br.com.everton.les2018.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
public class Book extends DomainEntity {
	
	@Column
	@NotBlank
	@Size(min = 6, max = 100)
	private String title;
	
	public Book() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}

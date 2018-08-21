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
	
	@Column
	@NotBlank
	@Size(min = 4, max = 4)
	private String year;
	
	@Column
	@NotBlank
	private String publisher;
	
	@Column
	@NotBlank
	private String edition;
	
	@Column
	@NotBlank
	private String shelfNumber;
	
	@Column
	@NotBlank
	private String subject;
	
	@Column(columnDefinition = "text")
	@NotBlank
	private String synopsis;
	
	@Column
	@NotBlank
	@Size(min = 10, max = 13)
	private String isbn;
	
	private Integer copy;
	
	
	public Book() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getShelfNumber() {
		return shelfNumber;
	}

	public void setShelfNumber(String shelfNumber) {
		this.shelfNumber = shelfNumber;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getCopy() {
		return copy;
	}

	public void setCopy(Integer copy) {
		this.copy = copy;
	}
	
	

}

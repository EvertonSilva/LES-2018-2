package br.com.everton.les2018.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
public class Book extends Publication {
	
	private static final long serialVersionUID = 1L;

	@Column(columnDefinition = "text")
	@NotBlank
	private String synopsis;
	
	@Column
	@NotBlank
	@Size(min = 10, max = 13)
	private String isbn;
	

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
	
	/*public boolean isReservable() {
		return this.getExemplars()
				.stream().filter(e -> e.getStatus() == ExemplarStatus.AVAILABLE)
				.count() == 0;
	}*/

}

package br.com.everton.les2018.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reservation extends LibraryTransaction {

	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Book book;

	public Publication getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
}

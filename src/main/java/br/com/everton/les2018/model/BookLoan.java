package br.com.everton.les2018.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loans")
public class BookLoan extends LibraryTransaction {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.EAGER,
				cascade = CascadeType.ALL)
	@JoinColumn(name = "loan_id")	
	private Set<Book> bookList = new HashSet<>();

	public Set<Book> getBookList() {
		return bookList;
	}

	public void setBookList(Set<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(Book book) {
		this.bookList.add(book);
	}
	
	public void removeBook(Book book) {
		this.bookList.remove(book);
	}

}

package br.com.everton.les2018.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "loans")
public class BookLoan extends LibraryTransaction {

	private static final long serialVersionUID = 1L;
	private LoanStatus loanStatus;

	@Transient
	private BookReturn currentBookReturn;

	@OneToMany(fetch = FetchType.EAGER,
				cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "loan_id")	
	private Set<Exemplar> exemplarList = new HashSet<>();
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "loan_id")
	private Set<BookReturn> bookReturns = new HashSet<>();

	public Set<BookReturn> getBookReturns() {
		return bookReturns;
	}

	public void setBookReturns(Set<BookReturn> bookReturns) {
		this.bookReturns = bookReturns;
	}
	
	public void addBookReturn(BookReturn bookReturn) {
		this.currentBookReturn = bookReturn;
		this.bookReturns.add(bookReturn);
	}
	
	public void removeBookReturn(BookReturn bookReturn) {
		this.bookReturns.remove(bookReturn);
	}

	public Set<Exemplar> getExemplarList() {
		return exemplarList;
	}

	public void setExemplarList(Set<Exemplar> exemplarList) {
		this.exemplarList = exemplarList;
	}
	
	public void addExemplar(Exemplar exemplar) {
		this.exemplarList.add(exemplar);
	}
	
	public void removeExemplar(Exemplar exemplar) {
		this.exemplarList.remove(exemplar);
	}

	public LoanStatus getLoanStatus() { return loanStatus; }

	public void setLoanStatus(LoanStatus loanStatus) { this.loanStatus = loanStatus; }

	public BookReturn getCurrentBookReturn() {
		return currentBookReturn;
	}

	public void setCurrentBookReturn(BookReturn currentBookReturn) {
		this.currentBookReturn = currentBookReturn;
	}
}

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
	private LoanStatus loanStatus;
	
	@OneToMany(fetch = FetchType.EAGER,
				cascade = {CascadeType.MERGE, CascadeType.REFRESH})
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
		bookReturn.getExemplarList().forEach(e -> {
			this.exemplarList.removeIf(loanEx -> loanEx.equals(e));
		});
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
}

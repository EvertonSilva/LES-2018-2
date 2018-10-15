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
				cascade = {CascadeType.MERGE})
	@JoinColumn(name = "loan_id")	
	private Set<Exemplar> exemplarList = new HashSet<>();

	public Set<Exemplar> getExemplarList() {
		return exemplarList;
	}

	public void setExemplarList(Set<Exemplar> exemplarList) {
		this.exemplarList = exemplarList;
	}
	
	public void addBook(Exemplar exemplar) {
		this.exemplarList.add(exemplar);
	}
	
	public void removeBook(Exemplar exemplar) {
		this.exemplarList.remove(exemplar);
	}

}

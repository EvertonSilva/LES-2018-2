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
@Table(name = "book_returns")
public class BookReturn extends LibraryTransaction {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.EAGER,
				cascade = {CascadeType.MERGE})
	@JoinColumn(name = "book_return_id")
	private Set<Exemplar> exemplarList = new HashSet<>();

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

package br.com.everton.les2018.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class LibraryTransaction extends DomainEntity {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.LAZY,
				cascade = CascadeType.ALL)
	@JoinColumn(name = "publication_id")
	private Set<Publication> publications = new HashSet<>();
	
	@Embedded
	private DateRange range;

	public Set<Publication> getPublication() {
		return publications;
	}

	public void setPublication(Set<Publication> publications) {
		this.publications = publications;
	}
	
	public void addPublication(Publication p) {
		this.publications.add(p);
	}

	public DateRange getRange() {
		return range;
	}

	public void setRange(DateRange range) {
		this.range = range;
	}
	
}

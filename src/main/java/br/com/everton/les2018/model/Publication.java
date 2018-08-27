package br.com.everton.les2018.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Publication extends DomainEntity {
	
	private static final long serialVersionUID = 1L;

	@Column
	@NotBlank
	@Size(min = 6, max = 100)
	private String title;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.MERGE})
	@JoinTable(name = "publications_authors",
				joinColumns = { @JoinColumn(name = "publication_id", referencedColumnName = "id") }, 
				inverseJoinColumns = { @JoinColumn(name = "author_id", referencedColumnName = "id") })
	private Set<Author> authors = new HashSet<>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
		
}

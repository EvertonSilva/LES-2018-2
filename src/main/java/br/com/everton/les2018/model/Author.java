package br.com.everton.les2018.model;

import java.util.Collections;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "authors")
public class Author extends DomainEntity {
	
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	@NotBlank
	private String name;
	
	@Column(nullable = true)
	private String middleName;
	
	@Column(nullable = false)
	@NotBlank
	private String lastName;
	
	@Column(nullable = false)
	@NotBlank
	private Integer number;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.MERGE})
	@JoinTable(name = "publications_authors",
				joinColumns = { @JoinColumn(name = "author_id", referencedColumnName = "id") }, 
				inverseJoinColumns = { @JoinColumn(name = "publication_id", referencedColumnName = "id") })
	private Set<Publication> publications = Collections.emptySet();
	
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@JsonIgnore
	public String fullName() {
		return new StringBuilder()
				.append(this.getLastName())
				.append(", ")
				.append(this.getMiddleName().substring(0, 1).toUpperCase())
				.append(" ")
				.append(this.getName())
				.toString();
	}

}

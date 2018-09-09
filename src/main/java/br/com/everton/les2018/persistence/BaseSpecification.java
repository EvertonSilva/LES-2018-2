package br.com.everton.les2018.persistence;

import org.springframework.data.jpa.domain.Specification;

public abstract class BaseSpecification<T> {
	
	private final String wildcard = "%";
	
	public abstract Specification<T> getFilter(String search);
	
	protected String containsLowerCase(String searchField) {
		return wildcard + searchField.toLowerCase() + wildcard;
	}

}

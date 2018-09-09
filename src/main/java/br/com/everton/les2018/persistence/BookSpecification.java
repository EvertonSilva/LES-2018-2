package br.com.everton.les2018.persistence;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import static org.springframework.data.jpa.domain.Specification.where;

import br.com.everton.les2018.model.Book;

@Component
public class BookSpecification extends BaseSpecification<Book> {
	
	public Specification<Book> getFilter(String search) {
		return where(titleContains(search));
	}

	private Specification<Book> titleContains(String title) {
		return bookAtributesContains("title", title);
	}

	private Specification<Book> bookAtributesContains(String attribute, String value) {
		return (root, query, cb) -> {
			if(value == null) {
				return null;
			}
			
			return cb.like(cb.lower(root.get(attribute)), containsLowerCase(value));
		};
	}

}

package br.com.everton.les2018.persistence;

import static org.springframework.data.jpa.domain.Specification.where;

import javax.persistence.criteria.SetJoin;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import br.com.everton.les2018.model.Book;
import br.com.everton.les2018.model.Exemplar;

@Component
public class BookSpecification extends BaseSpecification<Book> {
	
	public Specification<Book> getFilter(String search) {
		return where(titleContains(search));
	}
	
	public Specification<Book> bookForShelfNumber(String shelfNumber) {
		return (root, query, cb) -> {
			if(shelfNumber == null) {
				return null;
			}
			
			SetJoin<Book, Exemplar> exemplars = root.joinSet("exemplars");
			
			return cb.equal(exemplars.get("shelfNumber"), shelfNumber);
		};
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

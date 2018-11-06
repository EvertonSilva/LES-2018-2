package br.com.everton.les2018.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everton.les2018.model.Book;
import br.com.everton.les2018.persistence.BookSpecification;

@Service
public class BookService extends CrudService<Book> {
	
	@Autowired
	private BookSpecification bookSpecification;
	
	public BookService() {
		super.entityName = "book";
	}
	
	@Override
	public List<Book> searchBy(String filter) {
		return repo.findAll(bookSpecification.getFilter(filter));
	}
	
	public Optional<Book> getByShelfNumber(String shelfNumber) {
		// find book by exemplar shelf number
		Optional<Book> optBook = repo.findOne(bookSpecification.bookForShelfNumber(shelfNumber));
		Book b = optBook.get();
	
		// filter exemplars list
		b.getExemplars().removeIf(e -> !e.getShelfNumber().equals(shelfNumber));
		
		return optBook;
	}
	
}

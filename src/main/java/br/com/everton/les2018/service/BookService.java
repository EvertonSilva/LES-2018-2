package br.com.everton.les2018.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everton.les2018.model.Book;
import br.com.everton.les2018.persistence.BookSpecification;
import br.com.everton.les2018.persistence.repository.BookRepository;

@Service
public class BookService extends CrudService<Book> {

	@Autowired
	private BookRepository dao;
	
	@Autowired
	private BookSpecification bookSpecification;
	
	@Override
	public List<Book> searchBookBy(String filter) {
		return dao.findAll(bookSpecification.getFilter(filter));
	}
	
}

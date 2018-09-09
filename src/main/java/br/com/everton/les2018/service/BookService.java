package br.com.everton.les2018.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.com.everton.les2018.model.Book;
import br.com.everton.les2018.persistence.repository.BookRepository;
import br.com.everton.les2018.persistence.repository.BookSpecification;

@Service
public class BookService extends CrudService<Book> {
	
	@Autowired
	private BookSpecification bookSpecification;
	
	@Autowired
	private BookRepository dao;
	
	public List<Book> searchBookBy(String filter) {
		return dao.findAll(bookSpecification.getFilter(filter));
	}
	
}

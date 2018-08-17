package br.com.everton.les2018.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everton.les2018.model.Book;
import br.com.everton.les2018.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepo;
	
	@GetMapping("/books")
	public Page<Book> getBooks(Pageable pageable) {
		return bookRepo.findAll(pageable);
	}

}

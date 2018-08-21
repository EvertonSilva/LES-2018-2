package br.com.everton.les2018.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.everton.les2018.model.Book;
import br.com.everton.les2018.repository.BookRepository;

@CrossOrigin(origins = "http://arch-deathstar:8000")
@RestController
public class BooksController {
	
	@Autowired
	private BookRepository bookRepo;
	
	@GetMapping("/books")
	public Page<Book> getBooks(Pageable pageable) {
		return bookRepo.findAll(pageable);
	}
	
	@PostMapping("/books")
	public Book createBook(@Valid @RequestBody Book book) {
		return bookRepo.save(book);
	}

}

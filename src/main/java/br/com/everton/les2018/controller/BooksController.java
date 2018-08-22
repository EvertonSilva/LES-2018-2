package br.com.everton.les2018.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.everton.les2018.model.Book;
import br.com.everton.les2018.repository.BookRepository;

@CrossOrigin(origins = "http://arch-deathstar:8000")
@RestController
public class BooksController {
	
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/books")
	public Page<Book> getAllBooks(Pageable pageable) {
		return repo.findAll(pageable);
	}
	
	@GetMapping("/books/{bookId}")
	public Optional<Book> getBook(@PathVariable Long bookId) {
		return repo.findById(bookId);
	}
	
	@PostMapping("/books")
	public Book createBook(@Valid @RequestBody Book book) {
		return repo.save(book);
	}
	
	@PutMapping("/books/{bookId}")
	public Book updateBook(@PathVariable Long bookId,
							@Valid @RequestBody Book bookRequest) {
		
		Book book = repo.findById(bookId).get();
		bookRequest.setId(book.getId());
		
		return repo.saveAndFlush(bookRequest);
		
	}

}

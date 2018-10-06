package br.com.everton.les2018.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.everton.les2018.model.Book;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/books")
public class BooksController extends BaseController<Book> {
	
	@GetMapping
	public Page<Book> getAllBooks(Pageable pageable) {
		return service.list(pageable);
	}
	
	@GetMapping("/{bookId}")
	public Optional<Book> getBook(@PathVariable Long bookId) {
		return service.getEntity(bookId);
	}
	
	@GetMapping("/search")
	public List<Book> search(@RequestParam(value = "q") String query, Pageable pageable) {
		return service.searchBy(query);
	}
	
	@PostMapping
	public Book createBook(@Valid @RequestBody Book book) {
		return service.saveEntity(book);
	}
	
	@PutMapping("/{bookId}")
	public Book updateBook(@PathVariable Long bookId,
							@Valid @RequestBody Book bookRequest) {
		return service.updateEntity(bookRequest);
		
	}
}

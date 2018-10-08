package br.com.everton.les2018.controller;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everton.les2018.model.BookLoan;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/loans")
public class LoansController extends BaseController<BookLoan> {
	
	
	@GetMapping
	public Page<BookLoan> getAllLoans(Pageable pageable) {
		return service.list(pageable);
	}
	
	@PostMapping
	public BookLoan createLoan(@Valid @RequestBody BookLoan loan) {
		loan.setUser(currentUser());
		return service.saveEntity(loan);
	}

}

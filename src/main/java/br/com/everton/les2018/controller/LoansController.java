package br.com.everton.les2018.controller;

import javax.validation.Valid;

import br.com.everton.les2018.persistence.ReportDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import br.com.everton.les2018.model.BookLoan;
import br.com.everton.les2018.model.BookReturn;
import br.com.everton.les2018.service.BookLoanService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/loans")
public class LoansController extends BaseController<BookLoan> {
	
	
	@GetMapping
	public Page<BookLoan> getAllLoans(Pageable pageable) {
		return service.list(pageable);
	}

	@GetMapping("/report")
	public List<ReportDTO> getReport(@RequestParam(value = "startDate") String startDate,
									 @RequestParam(value = "endDate") String endDate) {
		return ((BookLoanService)service).loanByBookPerPeriod(startDate, endDate);
	}
	
	@PostMapping
	public BookLoan createLoan(@Valid @RequestBody BookLoan loan) {
		//loan.setUser(currentUser());
		return service.saveEntity(loan);
	}
	
	@PatchMapping("/{loanId}/return")
	public BookLoan returnBook(@PathVariable Long loanId,
								@Valid @RequestBody BookReturn bookReturn) {
		return ((BookLoanService) service).returnBook(loanId, bookReturn);
	}

}

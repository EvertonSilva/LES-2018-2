package br.com.everton.les2018.service;

import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.everton.les2018.model.BookLoan;
import br.com.everton.les2018.model.BookReturn;
import br.com.everton.les2018.model.ExemplarStatus;
import br.com.everton.les2018.persistence.repository.BookReturnRepository;
import br.com.everton.les2018.persistence.repository.ExemplarRepository;

@Transactional
@Service
public class BookLoanService extends CrudService<BookLoan> {

	@Autowired
	private ExemplarRepository exemplarRepo;
	
	@Autowired BookReturnRepository bookReturnRepo;
	
	public BookLoanService() {
		super.entityName = "bookloan";
	}
	
	@Override
	public BookLoan saveEntity(BookLoan entity) {
		entity.getExemplarList().forEach(e -> {
			e.setStatus(ExemplarStatus.UNAVAILABLE);
			exemplarRepo.saveAndFlush(e);
		});
		return super.saveEntity(entity);
	}
	
	@Override
	public List<BookLoan> searchBy(String filter) {
		return Collections.emptyList();
	}

	public BookLoan returnBook(Long loanId, @Valid BookReturn bookReturn) {
		super.context = "RETURN";
		BookLoan loan = super.getEntity(loanId).get();
		bookReturn = bookReturnRepo.saveAndFlush(bookReturn);
		
		loan.addBookReturn(bookReturn);
		loan = super.updateEntity(loan);
		
		
		return loan;
	}

}

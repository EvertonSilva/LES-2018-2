package br.com.everton.les2018.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.everton.les2018.model.BookLoan;

@Service
public class BookLoanService extends CrudService<BookLoan> {

	public BookLoanService() {
		super.entityName = "bookloan";
	}
	
	@Override
	public List<BookLoan> searchBy(String filter) {
		return Collections.emptyList();
	}

}

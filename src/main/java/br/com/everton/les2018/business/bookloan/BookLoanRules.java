package br.com.everton.les2018.business.bookloan;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.everton.les2018.business.IListRules;
import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.BookLoan;

@Component("bookloan")
public class BookLoanRules implements IListRules<BookLoan> {

	@Override
	public List<IStrategy<BookLoan>> getRules(String context) {
		return Collections.emptyList();
	}

}

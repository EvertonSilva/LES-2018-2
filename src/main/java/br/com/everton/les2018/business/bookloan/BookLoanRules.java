package br.com.everton.les2018.business.bookloan;

import java.util.*;

import br.com.everton.les2018.persistence.repository.BookLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.everton.les2018.business.IListRules;
import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.BookLoan;

@Component("bookloan")
public class BookLoanRules implements IListRules<BookLoan> {

	private ValidBookLimit validBookLimit;
	private Map<String, List<IStrategy<BookLoan>>> rules;

	@Autowired
	public BookLoanRules(ValidBookLimit validBookLimit) {
		this.rules = new HashMap<>();
		this.validBookLimit = validBookLimit;

		List<IStrategy<BookLoan>> saveRules = Arrays.asList(this.validBookLimit);
		List<IStrategy<BookLoan>> updateRules = Arrays.asList(
				new CloseBookLoan(), new SetDelayedStatusToBookLoan());
		List<IStrategy<BookLoan>> returnRules = Arrays.asList(
				new ReturnExemplarsToAvailable(), new RemoveReturnedExemplars());
		
		this.rules.put("SAVE", saveRules);
		this.rules.put("UPDATE", updateRules);
		this.rules.put("RETURN", returnRules);
	}

	@Override
	public List<IStrategy<BookLoan>> getRules(String context) {
		return this.rules.get(context);
	}

}

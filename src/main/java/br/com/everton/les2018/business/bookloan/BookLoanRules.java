package br.com.everton.les2018.business.bookloan;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.everton.les2018.business.IListRules;
import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.BookLoan;

@Component("bookloan")
public class BookLoanRules implements IListRules<BookLoan> {

	private Map<String, List<IStrategy<BookLoan>>> rules;

	@Autowired
	public BookLoanRules(ValidBookLimit validBookLimit,
						 ValidateDueDate validateDueDate,
						 CloseBookLoan closeBookLoan,
						 ReturnExemplarsToAvailable returnExemplarsToAvailable,
						 RemoveReturnedExemplars removeReturnedExemplars) {
		this.rules = new HashMap<>();

		List<IStrategy<BookLoan>> saveRules = Arrays.asList(validBookLimit);
		List<IStrategy<BookLoan>> updateRules = Arrays.asList(closeBookLoan);
		List<IStrategy<BookLoan>> returnRules = Arrays.asList(returnExemplarsToAvailable,
																removeReturnedExemplars, validateDueDate);
		
		this.rules.put("SAVE", saveRules);
		this.rules.put("UPDATE", updateRules);
		this.rules.put("RETURN", returnRules);
	}

	@Override
	public List<IStrategy<BookLoan>> getRules(String context) {
		return this.rules.get(context);
	}

}

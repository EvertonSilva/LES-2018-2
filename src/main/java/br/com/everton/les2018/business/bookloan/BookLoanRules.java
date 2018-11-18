package br.com.everton.les2018.business.bookloan;

import java.util.*;

import org.springframework.stereotype.Component;

import br.com.everton.les2018.business.IListRules;
import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.BookLoan;

@Component("bookloan")
public class BookLoanRules implements IListRules<BookLoan> {
	
	private Map<String, List<IStrategy<BookLoan>>> rules;
	
	public BookLoanRules() {
		this.rules = new HashMap<>();
		List<IStrategy<BookLoan>> saveRules = new ArrayList<>();
		List<IStrategy<BookLoan>> updateRules = Arrays.asList(new CloseBookLoan(), new SetDelayedStatusToBookLoan());
		List<IStrategy<BookLoan>> returnRules = new ArrayList<>();
		
		this.rules.put("SAVE", saveRules);
		this.rules.put("UPDATE", updateRules);
		this.rules.put("RETURN", returnRules);
	}

	@Override
	public List<IStrategy<BookLoan>> getRules(String context) {
		return this.rules.get(context);
	}

}

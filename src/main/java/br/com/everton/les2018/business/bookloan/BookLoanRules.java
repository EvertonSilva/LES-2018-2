package br.com.everton.les2018.business.bookloan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		this.rules.put("SAVE", saveRules);
	}

	@Override
	public List<IStrategy<BookLoan>> getRules(String context) {
		return this.rules.get(context);
	}

}

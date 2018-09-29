package br.com.everton.les2018.business.book;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.everton.les2018.business.IListRules;
import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.Book;

@Component("book")
public class BookRules implements IListRules<Book> {
	
	private Map<String, List<IStrategy<Book>>> bookBsnRules;
	
	public BookRules() {
		this.bookBsnRules = new HashMap<>();
		List<IStrategy<Book>> saveRules = Arrays.asList(new BookValidation());
		
		
		bookBsnRules.put("SAVE", saveRules);
	}
	
	@Override
	public List<IStrategy<Book>> getRules(String context) {
		return this.bookBsnRules.get(context);
	}
}

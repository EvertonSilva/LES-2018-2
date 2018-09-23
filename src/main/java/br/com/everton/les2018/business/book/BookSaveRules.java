package br.com.everton.les2018.business.book;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.everton.les2018.business.ISaveRules;
import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.Book;

@Component("save_book")
public class BookSaveRules implements ISaveRules<Book> {
	
	public List<IStrategy<Book>> getSaveRules() {
		return Arrays.asList(new BookValidation());
	}
}

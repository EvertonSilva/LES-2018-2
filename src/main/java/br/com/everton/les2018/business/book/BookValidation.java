package br.com.everton.les2018.business.book;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.Book;

public class BookValidation implements IStrategy<Book> {

	@Override
	public void process(Book entity) {
		System.out.println("Executing validations for " + entity.getClass().getSimpleName());
	}

}

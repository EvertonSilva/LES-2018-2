package br.com.everton.les2018.business.book;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.Book;
import br.com.everton.les2018.model.ExemplarStatus;

public class BookIsReservable implements IStrategy<Book> {

	@Override
	public void process(Book entity) {
		boolean isReservable;
		isReservable = entity.getExemplars()
							.stream().filter(e -> e.getStatus() == ExemplarStatus.AVAILABLE)
							.count() == 0;
		
		if(!isReservable) {
			throw new RuntimeException("Este livro não pode ser reservado pois existem exemplares disponíveis na biblioteca");
		}
		
	}

}

package br.com.everton.les2018.business.reservation;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.business.book.BookIsReservable;
import br.com.everton.les2018.model.Book;
import br.com.everton.les2018.model.Reservation;

public class ReservationIsPossible implements IStrategy<Reservation> {

	@Override
	public void process(Reservation entity) {
		IStrategy<Book> bookIsReservable = new BookIsReservable();
		bookIsReservable.process((Book) entity.getBook());
	}

}

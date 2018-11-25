package br.com.everton.les2018.business.bookloan;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.BookLoan;
import br.com.everton.les2018.model.ExemplarStatus;

public class ReturnExemplarsToAvailable implements IStrategy<BookLoan> {

    @Override
    public void process(BookLoan entity) {
        entity.getCurrentBookReturn().getExemplarList().forEach(e -> {
            e.setStatus(ExemplarStatus.AVAILABLE);
        });
    }
}

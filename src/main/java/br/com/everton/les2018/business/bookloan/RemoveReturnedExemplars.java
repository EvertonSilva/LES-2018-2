package br.com.everton.les2018.business.bookloan;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.BookLoan;

public class RemoveReturnedExemplars implements IStrategy<BookLoan> {
    @Override
    public void process(BookLoan entity) {

        entity.getCurrentBookReturn().getExemplarList().forEach(e -> {
            // remove o exemplar da lista de empréstimo
            entity.getExemplarList().removeIf(exemplar -> exemplar.equals(e));
        });
    }
}

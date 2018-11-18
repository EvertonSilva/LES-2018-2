package br.com.everton.les2018.business.bookloan;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.BookLoan;
import br.com.everton.les2018.model.LoanStatus;

public class CloseBookLoan implements IStrategy<BookLoan> {
    @Override
    public void process(BookLoan entity) {
        if(entity.getExemplarList().isEmpty()) {
            entity.setLoanStatus(LoanStatus.DONE);
        }
    }
}

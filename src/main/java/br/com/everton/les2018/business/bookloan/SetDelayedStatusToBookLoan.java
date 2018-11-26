package br.com.everton.les2018.business.bookloan;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.BookLoan;
import br.com.everton.les2018.model.LoanStatus;

public class SetDelayedStatusToBookLoan implements IStrategy<BookLoan> {
    @Override
    public void process(BookLoan entity) {
        if(entity.getPeriod().getDaysRemaining() < 0) {
            entity.setLoanStatus(LoanStatus.DELAYED);
        }
    }
}

package br.com.everton.les2018.business.bookloan;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.BookLoan;
import br.com.everton.les2018.model.LoanStatus;
import br.com.everton.les2018.model.OverdueFine;
import br.com.everton.les2018.persistence.repository.OverdueFineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidateDueDate implements IStrategy<BookLoan> {

    @Autowired
    private OverdueFineRepository repo;

    @Override
    public void process(BookLoan entity) {
        LocalDateTime dueDate = entity.getPeriod().getEndDate();
        LocalDateTime returnedDate = entity.getCurrentBookReturn().getPeriod().getStartDate();
        Duration duration = Duration.between(dueDate, returnedDate);

        if(duration.toDays() > entity.getUser().getRole().getLoanDays()) {
            entity.setLoanStatus(LoanStatus.DELAYED);
            entity.getUser().setEnabled(false);
            OverdueFine overdueFine = new OverdueFine();
            overdueFine.setEnabled(true);
            overdueFine.setLoan(entity);

            repo.save(overdueFine);
        }
    }
}

package br.com.everton.les2018.business.bookloan;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.BookLoan;
import br.com.everton.les2018.model.LoanStatus;
import br.com.everton.les2018.model.User;
import br.com.everton.les2018.model.UserRole;
import br.com.everton.les2018.persistence.repository.BookLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class ValidBookLimit implements IStrategy<BookLoan> {

    @Autowired
    private BookLoanRepository repo;

    @Override
    public void process(BookLoan entity) {
        final int totalBooksAmount;
        User user = entity.getUser();
        UserRole role = user.getRole();
        List<BookLoan> userLoans = repo.findByUser(user.getId(), LoanStatus.ACTUAL);

        // user hasn't loans
        if(userLoans.size() == 0) {
            return;
        }

        totalBooksAmount = countTotal(userLoans);
        if(role.getExemplarsAmount() > totalBooksAmount) { // user didn't reach amount limit?
            return; // user can borrow a book, just leave.
        }

        // if code reach this point user can't borrow anymore
        throw new RuntimeException("Limite de livros excedido");
    }

    private int countTotal(List<BookLoan> loans) {
        AtomicInteger counter = new AtomicInteger(0);
        loans.forEach(loan -> counter.addAndGet(loan.getExemplarList().size()));
        return counter.get();
    }
}

package br.com.everton.les2018.persistence.repository;

import br.com.everton.les2018.model.LoanStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.BookLoan;

import java.util.List;

@Repository
public interface BookLoanRepository extends JpaSpecificationRepository<BookLoan, Long> {

    // SELECT a, b FROM Author a JOIN a.books b
    @Query("select bl from BookLoan bl join bl.user u " +
            "where u.id = :userId and bl.loanStatus = :status")
    List<BookLoan> findByUser(@Param("userId") Long userId,
                              @Param("status") LoanStatus status);
}

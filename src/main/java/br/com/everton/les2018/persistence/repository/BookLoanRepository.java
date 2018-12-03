package br.com.everton.les2018.persistence.repository;

import br.com.everton.les2018.model.LoanStatus;
import br.com.everton.les2018.persistence.ReportDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.BookLoan;

import java.util.Date;
import java.util.List;

@Repository
public interface BookLoanRepository extends JpaSpecificationRepository<BookLoan, Long> {

    // SELECT a, b FROM Author a JOIN a.books b
    @Query("select bl from BookLoan bl join bl.user u " +
            "where u.id = :userId and bl.loanStatus = :status order by bl.id desc")
    List<BookLoan> findByUser(@Param("userId") Long userId,
                              @Param("status") LoanStatus status);

    @Query(
        value = "select sum(loan) as total, title, loanDate from (" +
                " select count(*) as loan, b.id, b.title, date_trunc('month', l.start_date) as loanDate" +
                " from exemplars e join books b on e.publication_id = b.id" +
                " join loans l on e.loan_id = l.id" +
                " where date_trunc('month', l.start_date) between :startDate and :endDate" +
                " group by b.id, date_trunc('month', l.start_date)" +
                " union " +
                " select count(b.id) as loan, b.id, b.title, date_trunc('month', br.start_date) as loanDate" +
                " from exemplars e join books b on e.publication_id = b.id" +
                " join book_returns br on e.book_return_id = br.id" +
                " where date_trunc('month', br.start_date) between :startDate and :endDate" +
                " group by b.id, date_trunc('month', br.start_date)" +
                ") as loan_amount group by title, loanDate",
        nativeQuery = true
    )
    List<ReportDTO> loansByBookPerPeriod(@Param("startDate") Date startDate,
                                         @Param("endDate") Date endDate);
}

package br.com.everton.les2018.persistence.repository;

import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.BookLoan;

@Repository
public interface BookLoanRepository extends JpaSpecificationRepository<BookLoan, Long> {

}

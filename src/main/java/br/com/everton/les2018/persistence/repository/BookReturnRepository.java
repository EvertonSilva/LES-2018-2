package br.com.everton.les2018.persistence.repository;

import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.BookReturn;

@Repository
public interface BookReturnRepository extends JpaSpecificationRepository<BookReturn, Long> {

}

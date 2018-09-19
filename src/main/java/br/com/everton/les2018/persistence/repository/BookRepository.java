package br.com.everton.les2018.persistence.repository;

import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.Book;

@Repository
public interface BookRepository extends JpaSpecificationRepository<Book, Long>  {

}

package br.com.everton.les2018.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.Book;

@Repository
public interface BookRepository 
		extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {

}

package br.com.everton.les2018.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.everton.les2018.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}

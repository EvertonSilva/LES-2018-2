package br.com.everton.les2018.persistence.repository;

import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.Author;

@Repository
public interface AuthorRespository extends JpaSpecificationRepository<Author, Long> {

}

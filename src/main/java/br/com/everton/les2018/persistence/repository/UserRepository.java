package br.com.everton.les2018.persistence.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.User;

@Repository
public interface UserRepository extends JpaSpecificationRepository<User, Long> {
	
	Optional<User> findByIdDocument(String idDocument);

}

package br.com.everton.les2018.persistence.repository;

import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.User;

@Repository
public interface UserRepository extends JpaSpecificationRepository<User, Long> {

}

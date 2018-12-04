package br.com.everton.les2018.persistence.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.User;

@Repository
public interface UserRepository extends JpaSpecificationRepository<User, Long> {
	
	Optional<User> findByIdDocument(String idDocument);

	@Query(value = "select u from User u join u.role r where r.roleType = 'student'")
	Page<User> findAllStudents(Pageable pageable);

}

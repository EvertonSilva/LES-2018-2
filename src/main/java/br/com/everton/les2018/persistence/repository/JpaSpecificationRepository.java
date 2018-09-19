package br.com.everton.les2018.persistence.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface JpaSpecificationRepository<T, ID> 
				extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {
	
	Page<T> findByEnabledTrue(Pageable pageable);
	
	Optional<T> findByIdAndEnabledTrue(Long id);
}

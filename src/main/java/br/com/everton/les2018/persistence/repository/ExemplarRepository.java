package br.com.everton.les2018.persistence.repository;

import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.Exemplar;

@Repository
public interface ExemplarRepository extends JpaSpecificationRepository<Exemplar, Long> {

}

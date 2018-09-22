package br.com.everton.les2018.persistence.repository;

import org.springframework.stereotype.Repository;

import br.com.everton.les2018.model.Reservation;

@Repository
public interface ReservationRepository extends JpaSpecificationRepository<Reservation, Long> {

}

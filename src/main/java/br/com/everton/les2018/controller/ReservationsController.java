package br.com.everton.les2018.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everton.les2018.model.Reservation;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ReservationsController extends BaseController<Reservation> {
	
	@GetMapping("/reservations")
	public Page<Reservation> getAllReservations(Pageable pageable) {
		return service.list(pageable);
	}
}

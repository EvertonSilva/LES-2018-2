package br.com.everton.les2018.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.everton.les2018.model.Reservation;

@Service
public class ReservationService extends CrudService<Reservation> {
	
	public ReservationService() {
		super.entityName = "reservation";
	}
	
	@Override
	public List<Reservation> searchBy(String filter) {
		return Collections.emptyList();
	}

}

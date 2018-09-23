package br.com.everton.les2018.business.reservation;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.Reservation;

public class ReservationValidate implements IStrategy<Reservation> {

	@Override
	public void process(Reservation entity) {
		System.out.println("Executando regras de negócio");
	}

}

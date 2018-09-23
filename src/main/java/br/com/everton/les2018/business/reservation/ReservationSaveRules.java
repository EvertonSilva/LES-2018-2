package br.com.everton.les2018.business.reservation;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.everton.les2018.business.ISaveRules;
import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.Reservation;

@Component("save_reservation")
public class ReservationSaveRules implements ISaveRules<Reservation> {

	@Override
	public List<IStrategy<Reservation>> getSaveRules() {
		return Arrays.asList(new ReservationValidate());
	}

}

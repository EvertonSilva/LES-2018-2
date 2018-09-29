package br.com.everton.les2018.business.reservation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.everton.les2018.business.IListRules;
import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.Reservation;

@Component("reservation")
public class ReservationRules implements IListRules<Reservation> {
	
	private Map<String, List<IStrategy<Reservation>>> allRules;

	@Override
	public List<IStrategy<Reservation>> getRules(String context) {
		this.allRules = new HashMap<>();
		List<IStrategy<Reservation>> saveRules =  Arrays.asList(new ReservationDate(),
																new ReservationIsPossible());
		
		this.allRules.put("SAVE", saveRules);
		
		return this.allRules.get(context);
	}

	
}

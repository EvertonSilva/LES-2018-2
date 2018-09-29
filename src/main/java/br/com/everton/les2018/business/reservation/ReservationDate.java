package br.com.everton.les2018.business.reservation;

import java.time.DayOfWeek;

import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.DateRange;
import br.com.everton.les2018.model.Reservation;

public class ReservationDate implements IStrategy<Reservation> {
	private DateRange period;
	
	@Override
	public void process(Reservation entity) {
		this.period = entity.getPeriod();
		
		if(period.getStartDate().getDayOfWeek() == DayOfWeek.SATURDAY
				|| period.getStartDate().getDayOfWeek() == DayOfWeek.SUNDAY) {
			throw new RuntimeException("A data de reserva não pode ser em fins de semana");
		}
		
		if(period.getStartDate().getDayOfWeek() == DayOfWeek.FRIDAY) {
			period.addDaysTo("end", 4L);
		} else {
			period.addDaysTo("end", 2L);
		}
		
		
	}

}

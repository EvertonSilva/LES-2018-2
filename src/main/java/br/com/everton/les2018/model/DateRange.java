 package br.com.everton.les2018.model;

import java.time.Duration;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;

@Embeddable
public class DateRange {
	
	private LocalDateTime startDate = null;
	private LocalDateTime endDate= null;

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	
	public long getDuration() {
		Duration duration = Duration.between(startDate, endDate);
		return duration.toDays();
	}
	
	public boolean startDateIsAfterEndDate() {
		return startDate.isAfter(endDate);
	}
	
	public void addDaysTo(String date, Long days) {
		if("start" == date) {
			startDate.plusDays(days);
		} else {
			endDate.plusDays(days);
		}
	}
}

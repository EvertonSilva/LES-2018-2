 package br.com.everton.les2018.model;

import java.time.Duration;
import java.time.LocalDateTime;
import javax.persistence.Embeddable;

@Embeddable
public class DateRange {
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;

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
	
	public long getDaysRemaining() {
		Duration duration = Duration.between(startDate, endDate);
		return duration.toDays();
	}
}

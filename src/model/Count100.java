package model;

import java.time.LocalDate;

public class Count100 {

	public void count() {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plusDays(100);
	}
}

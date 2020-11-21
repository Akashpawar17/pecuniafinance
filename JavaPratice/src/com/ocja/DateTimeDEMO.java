package com.ocja;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

public class DateTimeDEMO {

	public static void main(String[] args) {
		LocalDate d=LocalDate.of(1998, 02, 12);
	 d=d.plusDays(10);
		System.out.println(d);
		/*
		 * int dd=d.getDayOfMonth();
		 * 
		 * int mm=d.getMonthValue(); int yy=d.getYear();
		 * 
		 * System.out.printf("%d-%d-%d",dd,mm,yy);
		 */
		
		/*
		 * LocalDate birthday =LocalDate.of(1998, 07, 01); Period
		 * p=Period.between(birthday, d);
		 * System.out.printf("year is %d date is%d month is %d",p.getYears(),p.getDays()
		 * ,p.getMonths());
		 */
		/*
		 * ZoneId z=ZoneId.systemDefault(); System.out.println(z);
		 */
		
		
		
		
		
		
		
		
	};

}

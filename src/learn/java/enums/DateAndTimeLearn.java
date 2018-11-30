package learn.java.enums;

import java.time.LocalDate;
import java.time.Month;

public class DateAndTimeLearn {

	public static void main(String[] args) {
		// the current date
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.toString());
		
		// 2014-02-10
		LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
		System.out.println(tenthFeb2014.toString());
		
		// months values start at 1 (2014-08-01)
		LocalDate thirteenMar2011 = LocalDate.of(2011, 3, 13);
		System.out.println(thirteenMar2011.toString());
		
		// the 65th day of 2010 (2010-03-06)
		LocalDate seventyTwoDayOf2011 = LocalDate.ofYearDay(2018, 72);
		System.out.println(seventyTwoDayOf2011.toString());
	}

}

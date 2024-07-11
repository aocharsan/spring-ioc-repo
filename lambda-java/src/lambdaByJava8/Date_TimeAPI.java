package lambdaByJava8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Date_TimeAPI {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate customDate = LocalDate.of(1998, 05, 22);
		System.out.println(customDate);
		Month month = today.getMonth();
		int dayOfMonth = today.getDayOfMonth();
		int year = today.getYear();
		System.out.println(dayOfMonth + " " + month + " " + year);

		LocalDate yesterday = today.minusDays(1);
		LocalDate customMonth = today.minusMonths(6);
		LocalDate customYr = today.minusYears(25);
		System.out.println(yesterday + " " + customMonth + " " + customYr);
		
		LocalTime now = LocalTime.now();
		LocalTime customTime = LocalTime.of(12, 30,34);
		System.out.println(customTime);
		
		
		
	}
	
	
	
}

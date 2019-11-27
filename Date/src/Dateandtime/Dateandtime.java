package Dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dateandtime {

	public static void main(String[] args) {
		
System.out.println("Today Date");
LocalDate date=LocalDate.now();//create a date object
System.out.println(date);//Display the current date


System.out.println("Today Time");
LocalTime time=LocalTime.now();//create a Time object
System.out.println(time);//Display the current Time

System.out.println("Today Date and Time");
LocalDateTime dt=LocalDateTime.now();//create a Time and date  object
System.out.println(dt);//Display the current Date and Time
	}

}

package Dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formaldateandtime {

	public static void main(String[] args) {
		
		LocalDateTime dt=LocalDateTime.now();//create a Time and date  object
		System.out.println("Before formatting :"+dt);
		
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern(" E, MM/dd/yyyy ,hh:mm:ss");
		String formatDate=dt.format(format);
		System.out.println("After formatting :" +formatDate);
	}
}

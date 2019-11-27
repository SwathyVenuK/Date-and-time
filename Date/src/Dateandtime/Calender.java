package Dateandtime;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		// calender class provide date and time.
	 Calendar calendar = Calendar.getInstance();
	   System.out.println("At present Calendar's Year:" + calendar.get(Calendar.YEAR));
	   System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));
	    System.out.println("The current date is : " + calendar.getTime());
	    calendar.add(Calendar.DATE, -7);
	    System.out.println("7 days ago: " + calendar.getTime());
	   calendar.add(Calendar.MONTH, 10);// 10 month later
	   System.out.println("10 months later: " + calendar.getTime());
	    calendar.add(Calendar.YEAR, 10);
	    System.out.println("10 years later: " + calendar.getTime());
	    }
	
	}



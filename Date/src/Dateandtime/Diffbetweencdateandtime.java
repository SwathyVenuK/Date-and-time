
package Dateandtime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Diffbetweencdateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Booking Date");
		    String start =sc.nextLine();// format 2017-11-20
		    System.out.println("end Date");
		    String end = sc.nextLine();
		    LocalDate ds = LocalDate.parse(start);
		    LocalDate de = LocalDate.parse(end);
		    long total = ChronoUnit.DAYS.between(ds,de);
		    System.out.println(total);
		  }
	}



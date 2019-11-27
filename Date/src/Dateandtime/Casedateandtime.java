package Dateandtime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Casedateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		 Guest obj=new Guest();
		 System.out.println("Enter the name");
		 String name=s.next();
		 System.out.println("Enter the Address");
		 String add=s.next();
		 System.out.println("Enter the number of rooms");
		 int room=s.nextInt();
		 System.out.println("Enter the number of persons");
		 int persons=s.nextInt();
		 System.out.println("(AC/NAC)");
		 String ac=s.next();
		 	System.out.println("Booking Date");
		    String start =s.next();// format 2017-11-20
		    System.out.println("Check out date");
		    String end = s.next();
		    LocalDate ds = LocalDate.parse(start);
		    LocalDate de = LocalDate.parse(end);
		    long total = ChronoUnit.DAYS.between(ds,de);
		    int x=persons/2;
		    int amount;
		    String acc="";
		    int a=0;int p;int sum=0;
		    if(x<=room)
		    {
		    	if(ac.equals("Ac"))
		    		{
		    		acc="Yes";
		    		a=1150;
		    		}
		    	else
		    	{
		    		acc="No";
		    		a=1000;
		    	}
		    	if(persons%2==0)
		    	{
		    		p=persons*500;
		    				
		    	}
		    	else
		    	{

			    	int y=persons-1;
			    	p=y*500+250;
		    	}
		    	
		    	sum=a+p;
		    	obj.display(sum,total,name,add,room,persons,acc);
		    }
		    else
		    {
		    	 System.out.println("Book another room");
		    }
		    
		
		    
		  }
	
     
	}
class Guest{

	public void display(int sum, long total, String name, String add, int room, int persons, String acc) {
		// TODO Auto-generated method stub
		 int amount1 =(int) (sum*total);
	     System.out.println("Name:"+name);
	    System.out.println("Address:"+add);
	    System.out.println("No.of rooms:"+room);
	    System.out.println("No.of Guests:"+persons);
	    System.out.println("Ac"+acc);
	    System.out.println("No. of days:"+total);
	    System.out.println("Amount:="+amount1);
		
	}

}


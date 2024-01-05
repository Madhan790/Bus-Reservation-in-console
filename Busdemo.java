package busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Busdemo 
{
 	public static void main(String args[])
	{
		ArrayList<bus> buses=new ArrayList<bus>();
		buses.add(new bus(1,true,2));
		buses.add(new bus(2,true,49));
		buses.add(new bus(3,false,48));
		
		ArrayList<Booking> bookings=new ArrayList<Booking>();
	
		
		 
		int useropt=1;
		Scanner sc=new Scanner(System.in);
		
		for(bus b:buses)
		{
			b.displaybus();
		}
		
		while(useropt==1)
		{
			System.out.println("press 1 for booking press 2 for exit");
		    useropt=sc.nextInt();
		if(useropt==1)
		{
			Booking booking=new Booking();
			if(booking.isAvailable(bookings,buses))
			{
				bookings.add(booking);
				System.out.println("your booking is confirmed");
				for(bus b:buses)
				{
					b.displaybus();
				}
				
			}
			else
			{
				System.out.println("sorry is full, try another bus or date");
			}
			
		}
		
		
		}
		
		
	}

}

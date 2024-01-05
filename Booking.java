package busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking
{
	
	String pasName;
	int busNo;
	Date date;
	
	Booking()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name please");
	pasName=sc.next();
	System.out.println("Enter your bus no");
	busNo=sc.nextInt();
	System.out.println("Enter your date dd-mm-yyyy");
	String dateInput=sc.next();
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	try {
		date=dateFormat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
   public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<bus> buses)
   {
	   int capacity=0;
	   for (bus B:buses)
	   {
		if(B.getBusNo()== busNo)   
		{
			capacity= B.getCapacity();
		}
	   }
	   int booked=0;
	   for(Booking b:bookings)
	   {
		   if(b.busNo == busNo && b.date.equals(date))
		   {
			   booked++; 
		   }
		  int availabe=capacity-booked; 
	   }
	return booked<capacity?true:false;
	
   }
   
	}


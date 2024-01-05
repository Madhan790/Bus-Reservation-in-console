package busreservation;



public class bus
{
	private int busNo;
	private Boolean ac;
	private int capacity;
	
	bus(int no,boolean a,int cap)
	{
		this.busNo=no;
		this.ac=a;
		this.capacity=cap;
	}
	public int getBusNo()
	{
		return busNo;
	}
	public boolean isAc()
	{
		return ac;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public void setCapacity(int cap)
	{
	    capacity=cap;
	}
	
	public void setAc(boolean val)
	{
		 ac=val;
	}
	
	public void displaybus()
	{
		System.out.println("bus no: "+ busNo +" ac type: "+ ac +" capacity: "+capacity);
	}
}

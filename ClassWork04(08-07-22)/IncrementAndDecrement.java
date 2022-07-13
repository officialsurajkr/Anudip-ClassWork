package basicprograms;

public class IncrementAndDecrement 
{
	public void postIncrement() //creating postIncrement method
	
	{
		int x=10,y;  //variables
	
		
		System.out.println("Impelementing Post Increment");
		
		y=x++;     //y=10   , 10+1=11 , x=11
		
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
		System.out.println("    ");
	}
	
	public void preIncrement()     // preIncrement method
	{
		int x=10,y;
		
		System.out.println("Impelementing pre Increment");
		
		y=++x;   // 1+x => 1+10=11  , y=11, x=11
		
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
		System.out.println("    ");
	}
	
	public void postDecrement()     // postDecrement method
	{
		int x=10,y;
		
		System.out.println("Impelementing post Decrement");
		
		y=x--;   // y=10 , x-1=>10-1=9 , x=9
		
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
		System.out.println("    ");
	}
	
	public void preDecrement()     // preDecrement method
	{
		int x=10,y;
		
		System.out.println("Impelementing pre Decrement");
		
		y=--x;   // x-1=10-1=9 , y=9 ,x=9
		
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
		System.out.println("    ");
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		//creating Object with the help of new keyword and initializing with class Name.
		
		IncrementAndDecrement obj=new IncrementAndDecrement(); 
		
				obj.postIncrement();   //Calling Method with the help of object
				obj.preIncrement();
				obj.postDecrement();
				obj.preDecrement();
		
	}
	

}

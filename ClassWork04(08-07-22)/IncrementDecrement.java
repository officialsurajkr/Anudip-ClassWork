package basicprograms;

public class IncrementDecrement
{
	public static void main(String[] args)
	{
		int x=10,y;   //Taking Variable
		
		
		System.out.println("Impelementing Post Increment");
		
		y=x++;    //y=10 , x+1=> 10+1=11 , x=11
		
		System.out.println("X= "+x);    //x=11
		System.out.println("Y= "+y);   //y=10
		System.out.println("    ");
		
	
		
		System.out.println("Impelementing pre-Increment");
		y=++x;  //1+x=>1+11 , y=12 , x=12 
		
		System.out.println("X= "+x);   // x=12
		System.out.println("Y= "+y);	// y=12
		System.out.println("    ");
		
		

		System.out.println("Impelementing post-Decrement");
		
		y=x--;  // y=12 ,  x-1=>12-1=11 , x=11
		
		System.out.println("X= "+x);   // x=11
		System.out.println("Y= "+y);	// y=12
		System.out.println("    ");
		
		
		System.out.println("Impelementing pre-Decrement");
		
		y=--x;  //  x-1=>11-1=10 , y=10  , x=10
		
		System.out.println("X= "+x);   // x=10
		System.out.println("Y= "+y);	// y=10
		System.out.println("    ");
		
		
	}

}

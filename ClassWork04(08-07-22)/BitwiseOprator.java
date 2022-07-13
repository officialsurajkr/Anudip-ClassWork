package basicprograms;

public class BitwiseOprator 
{
	
		//creating a method
		
	public void bitwiseAnd ()
		{
			int x=10 , y=6 ,z;  
			z=x&y;
			
			System.out.println("---- bitwise AND Operation-----");
			System.out.println("Bitwise "+x+ " & "+y+ " = "+z);	      //Calculating BitwiseAND
			
			System.out.println("    ");
		}
	
	public void bitwiseOR ()  //bitwiseOR Method
	{
		int x=5 , y=2 ,z;
		z=x|y;
		System.out.println("---- bitwise OR Operation----");
		System.out.println("Bitwise "+x+ " | "+y+ " = "+z);	  ////Calculating BitwiseOR
		System.out.println("    ");
	}
	
	

	public void bitwiseCompliment ()  //bitwiseCompliment Method
	{
		int x=8 ,y;
		y=~x;       //Calculating Bitwise Compliment
		System.out.println(" ----bitwise Compliment Operation----");
		System.out.println(y);	
		System.out.println("    ");
	}
	
	public void bitwiseXOR ()  //bitwiseXOR Method
	{
		int x=10 ,y=8, z;
			z=x^y;
		
		System.out.println(" ----bitwise X-OR Operation----");
		System.out.println("bitwise "+x+"^"+y+" = "+z);	////Calculating BitwiseXOR
		System.out.println("    ");
	}
	
	
	
	public static void main(String[] args)    //Main Method
	{
		//Creating Object
		
		BitwiseOprator bobj=new BitwiseOprator();
		
					   bobj.bitwiseAnd();  //Calling methods with referance
					   bobj.bitwiseOR();
					   bobj.bitwiseCompliment();
					   bobj.bitwiseXOR();
		
	}
		
		
	

	
	
}

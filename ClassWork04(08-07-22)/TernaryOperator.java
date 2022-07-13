package basicprograms;

public class TernaryOperator
{
	public static void main(String[] args) 
	{
		int a=100, b=20,max,min;
		/*
		 	if(a>b)
		 		System.out.println( a+" is greater");
		 	else
		 		System.out.println( b+" is greater");
		 	
		 */
		
			max=(a>b)?a:b;
		System.out.println(max+" is greater");
	
		min=(a<b)?a:b;
		System.out.println(min+" is smaller");
		
	}

}

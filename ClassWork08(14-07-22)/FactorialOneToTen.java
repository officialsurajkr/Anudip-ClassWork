package basicprograms;

public class FactorialOneToTen
{
	public static void main(String[] args)
	{
		int i,fact=1; 
				
		for(i =1 ; i <=10 ; i++ )
		{
			fact=fact*i;
			System.out.println("The Factoril of "+ i+" is " +fact);
			
		}
		
		
	}

}

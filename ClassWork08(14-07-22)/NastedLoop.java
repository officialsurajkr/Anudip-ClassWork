package basicprograms;

public class NastedLoop
{
	public static void main(String[] args) 
	{
		int i ,j; //Variable for loop
		
		for(i=1 ; i<4 ; i++) //External Loop
		{
			
			for(j=1; j<3; j++) //Internal Loop
			{
				System.out.print(" Hello ");
			}
			System.out.println();
		}//end external loop
		
	}

}

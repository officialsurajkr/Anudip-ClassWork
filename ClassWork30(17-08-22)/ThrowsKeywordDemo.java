package exceptionhandling;

public class ThrowsKeywordDemo
{
	static void validateAge(int age) throws AgeValidationException
	{
		
		
			if(age<18)
				
					throw new AgeValidationException("Age is not valid for vote");
				else
					System.out.println("age is valid");
		}
		
		

	
	public static void main(String[] args) 
	{
		
		
		try
		{
		validateAge(12);
		System.out.println("Thanku for visit");
		}
		catch(AgeValidationException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

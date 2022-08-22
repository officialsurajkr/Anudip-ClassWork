package exceptionhandling;

//implementing Unchecked Exception-occurs on run time

//public class AgeValidationException extends RuntimeException
//{
//	public AgeValidationException (String message)
//	{
//		super(message);
//	}
//
//}


//checked Exception -occurs on compile time

public class AgeValidationException extends Exception
{
	public AgeValidationException (String message)
	{
		super(message);
	}

}

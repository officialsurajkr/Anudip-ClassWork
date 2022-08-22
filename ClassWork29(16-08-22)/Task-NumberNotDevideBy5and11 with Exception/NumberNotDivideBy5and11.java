package exceptionhandling;

import java.util.Scanner;



public class NumberNotDivideBy5and11 
{
	static void getNumber()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number ");
		int num=sc.nextInt();
		
		
		try
		{
		//condition for not divisible by 5 and 11
		if((num%5==0) && (num%11==0))
			System.out.println(num+ " is divisible by both  5 and 11");
			
		else
				
			throw new NumberNotDevideException(num+" is not divisible by 5 and 11");
		}
		catch(NumberNotDevideException e)
		{
			System.out.println(e.getMessage());
		}
			
		
	}
	public static void main(String[] args)  //main() method
	{
		///implementing checked Exception-occurs on compile
		
			getNumber();
		
		
		System.out.println("Thank you for visit");
		
	}

}

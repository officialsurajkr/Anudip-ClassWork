package basicprograms;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) 
	{
		//Variables for loop
		int number,reminder,reverse=0,temp;
		
		Scanner sc=new Scanner(System.in); //Scanner Object 
		System.out.println("Enter any Number");
		number=sc.nextInt();
		//store actual variable for future use
		temp=number;
		
		//Calculating Reverse Number
		while(number!=0)
		{
			reminder=number%10;  
			reverse=reverse*10+reminder;
			number=number/10;
		}//while loop end
		System.out.println("Reverse of "+temp+ " is "+reverse);	
		
		//Checking Palindrome
		if(temp==reverse)
			System.out.println("This is Palindrome");
		else
			System.out.println("This is not Palindrome");
	}
	
}

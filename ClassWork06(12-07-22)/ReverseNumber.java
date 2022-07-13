package basicprograms;

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args) 
	{
		//Counter Variable for loop
		int number,reminder,reverse=0,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		number=sc.nextInt();
		
		//store actual variable for future use
		temp=number;
		
		while(number!=0)
		{
			reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}//while loop end
		System.out.println("Reverse of "+temp+ " is "+reverse);
		
		
	}

}

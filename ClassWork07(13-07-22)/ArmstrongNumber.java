package basicprograms;
import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args)
	{
		//Counter Variable for loop
		int number, count=0,sum=0,reminder,temp;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter any Number to Check Armstrong Number or not");
			number=sc.nextInt();
			
			//store actual variable for future use
			temp=number;
			
			//count no of digit
			while(number!=0)
			{
				count++;
				number=number/10;
			}
			System.out.println("total digit in "+temp+" is "+count);
			
			
			//again assign value from temp to number become zero
			number=temp;
			
			//Calculate Armstrong number
			while(number>0)
			{
				reminder=number%10;
				sum+=Math.pow(reminder, count);  //using Math Class Property
				number=number/10;		
			}
			//Checking actual number is matched with sum or not
			if(temp == sum)
				System.out.println("It is Armstrong Number");
			else
				System.out.println("It is not a Armstrong Number");
			
			
	}

}

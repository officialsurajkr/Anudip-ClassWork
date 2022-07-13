package basicprograms;
import java.util.Scanner;

public class FirstAndLastDigit 
{
	public static void main(String[] args)
	{
		int num,lastnum;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		 num=sc.nextInt();
		 lastnum=num%10;
		 
		
		for(;num>=10;)
		{
			num=num/10;
		}
			System.out.println("First Digit:"+num);
			System.out.println("Last Digit:"+lastnum);
		
	}

}

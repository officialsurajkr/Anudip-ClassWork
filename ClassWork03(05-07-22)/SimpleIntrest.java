//program of Simple Intrest

import java.util.Scanner;
public class SimpleIntrest
{
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Principle");
			int p=sc.nextInt();
			
		System.out.println("Enter the Rate");
			int r=sc.nextInt();
		System.out.println("Enter the Time");
			int t=sc.nextInt();
			
			System.out.println("Simple intrest is "+(p*r*t)/100);
	}
}
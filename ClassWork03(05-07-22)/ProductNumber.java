//program of find product of 2 number.

import java.util.Scanner;
public class ProductNumber
{
	
	public static void main(String []args)
	{
		 Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
			int n1=sc.nextInt();
			
		System.out.println("Enter the Second Number");
			int n2=sc.nextInt();
			
			System.out.println("Product of both number is "+( n1*n2));
	}
}
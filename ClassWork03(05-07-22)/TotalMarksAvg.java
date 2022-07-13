
//program of claculating total marks and average of 5 subject.

import java.util.Scanner;
public class TotalMarksAvg
{
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the marks of Hindi");
			int h=sc.nextInt();
			
		System.out.println("Enter the marks of English");
			int e=sc.nextInt();
		System.out.println("Enter the marks of Math");
			int m=sc.nextInt();
		System.out.println("Enter the marks of Science");
			int s=sc.nextInt();
		System.out.println("Enter the marks of Social Science");
			int ss=sc.nextInt();
			
			
			int tt=(h+e+m+s+ss);
			
			System.out.println("Total Marks is "+ tt);
			
			float avg=tt/5;
			
			System.out.println("Average is " + avg);
	}
}
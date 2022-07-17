/*
	w.a.p to print half Diamond star pattern
				* 
				* * 
				* * * 
				* * * * 
				* * * * * 
				* * * * * 
				* * * * 
				* * * 
				* * 
				* 
 */


package basicprograms;

import java.util.Scanner;

public class HalfDimond
{
	public static void main(String[] args)
	{
				int i,j ,num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No. of Rows ");
		num=sc.nextInt();
			
		
		for(i=1 ; i<=num ; i++) //it will calculate no.of rows
		{
			for(j=1 ; j<=i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1 ; i<=num;i++)  //it will print no of rows 
		{
			for(j=i ; j<=num; j++) //this loop print no of column
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}

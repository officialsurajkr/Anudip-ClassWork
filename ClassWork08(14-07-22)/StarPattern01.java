/*
		W.a.p to print 
				*
				* *
				* * *
				* * * *
				* * * * *
*/

package basicprograms;
import java.util.*;

public class StarPattern01 
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
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}


//Wap to calculate sum of natural number from 1 to n.

package basicprograms;
import java.util.Scanner;

public class SumOfNaturalNum 
{
	public static void main(String[] args) 
	{
		//counter variable for loop
		int i ,number,sum=0;
		
		Scanner sc=new Scanner(System.in); //Scanner Object
		System.out.println("Enter a Natural Number");
		number=sc.nextInt();
		
		for(i=1 ; i<=number; i++)
		{
			sum=sum+i;
		}//loop end
		System.out.println("Sum of given Natural Number is "+sum);
	}

}

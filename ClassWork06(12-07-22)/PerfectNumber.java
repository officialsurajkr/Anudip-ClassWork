package basicprograms;
import java.util.Scanner;

public class PerfectNumber
{
	public static void main(String[] args)
	{
		int i,num,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Value");
		num=sc.nextInt();
		
		//Calculate perfect number
		for(i=1 ; i<num ; i++)
		{
			if(num % i ==0)
			{
				sum=sum+i;  //sum+=i;
			}
		}//loop end
		
		if(num==sum)
			System.out.println(num+" is perfacet number");
		else
			System.out.println(num+ " is not perfact number");
		
	}
		
			

}

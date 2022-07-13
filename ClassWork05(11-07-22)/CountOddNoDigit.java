package basicprograms;

import java.util.Scanner;

public class CountOddNoDigit 
{
	public static void main(String[] args)
	{
		int num,i,count=0,temp;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		 num=sc.nextInt();
		temp=num;
		 for(i=1;i<=num;i++ )
		 {
			if(i%2 !=0)
			{
				
				 count++;
				 System.out.println(i+"\t");
			
			} 
		 }
		
		System.out.println( "number of Odd digit of "+temp+" is "+count);
	}

}

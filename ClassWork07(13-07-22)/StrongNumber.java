package basicprograms;
import java.util.*;

public class StrongNumber 
{
	public static void main(String[] args) 
	{
		//counter variable for loop
		int i,num,rem,temp,sum=0,fact;
		
		Scanner sc=new Scanner(System.in); //
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		//store actual variable for future use
		temp=num;
		
		//calculating Strong Number 
		while(num>0)
		{
			rem=num%10;
			fact=1;
			//calculating factorial for reminds
			for(i=1 ; i<=rem ; i++)
			{
				fact=fact*i;	
			}//end of for
			sum+=fact; // 5!=120 , 4!=24, 1!=1-----120+24+1=145 , sum=145
			num=num/10;
		}//end of while
		if(sum== temp)
			System.out.println(temp+" is a strong number");
		else
		System.out.println(temp+" is not a strong number");
		
	}

}

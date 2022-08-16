//wap to find out all negative numbers from an array
//and print those negative numbers


package arraydemo;
import java.util.Scanner;

public class NegativeNoArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Give 5 number");
		
		int arr[]= new int[5];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
			{
				System.out.println(+arr[i]+" is Positive");
			}
			 else if(arr[i]<0)
			{
				System.out.println(arr[i]+" is Negative");
			}
		}
		
				
				
	}

}

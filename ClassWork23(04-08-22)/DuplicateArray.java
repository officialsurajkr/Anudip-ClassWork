package arraydemo;
import java.util.Scanner;

public class DuplicateArray
{
	public static void main(String[] args)
	{
		int arr[],size,i,j,count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of Array");
		size=sc.nextInt();
		
		//initialize the array
		
		arr=new int [size];
		
		System.out.println("Enter "+size+" element in an array");
	
		for(i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		//print the element
		for(i=0; i<size; i++)
		{
			System.out.println( arr[i]);
		}
		
		//find duplicate element
		
		for(i=0 ; i<size; i++)
		{
			for (j=i+1; j<size; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println("total number of duplicate element is "+count);
		
	}


}

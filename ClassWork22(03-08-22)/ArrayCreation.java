package arraydemo;
import java.util.Scanner;

public class ArrayCreation 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		//compile time
		int arr[]= {2,4,5,3,9};
		
		//print the array element
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println("Enter 5 elements in an array:");
		//Run time
		int arr2[]=new int[5];
		
		//asing value from user
		for(int i=0 ; i<arr2.length; i++)
		{
			arr2[i]=sc.nextInt();		
		}
		
		System.out.print("Arrey elements are:");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		
		//For each loop
		System.out.println("Printinf Using for each loop");
		for(int var :arr)
		{
			System.out.println(var);
		}
	}

}

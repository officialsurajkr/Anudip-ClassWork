package arraydemo;

import java.util.Scanner;

public class InsertSpecificPosition 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[20];
		int size,i,num,pos;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		size=sc.nextInt();
		
		System.out.println("Enter "+size+" elements in an array");
		for(i=0; i<size ;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//input new element and position to insert
		System.out.println("Enter element you want to insert");
		num=sc.nextInt();
		
		System.out.println("Enter element Position");
		pos=sc.nextInt();
		
		
		//Checking position is valid or not
		if(pos>size || pos<0)
		{
			System.out.println("Invalid Position");
		}
		else
		{
			//making room for new element : shifting
			for(i=size; i>=pos; i--)
			{
				arr[i]=arr[i-1];
			}
			//insert new element at given position and increment size
			arr[pos-1]=num;
			size++;
			
			//print array after insert operation
			System.out.println("Array elements after insertion");
			for(i=0; i<size;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}

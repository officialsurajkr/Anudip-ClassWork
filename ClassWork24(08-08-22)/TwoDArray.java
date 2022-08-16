package arraydemo;

import java.util.Scanner;

public class TwoDArray
{
	public void compileTime()
	{
		//Compile time 2D array
		
				int arr[][]= {{1,2,3,0},{4,5,6,0},{7,8,9,0}};
				
				for(int i=0; i<arr.length; i++)
				{
					for(int j=0; j<=arr.length; j++)
					{
						System.out.print(arr[i][j]+" ");
					}
					System.out.println(" ");
				}
				
		
	}
	public void runTime()
	{
		int row ,col;
		int arr[][];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column");
		row=sc.nextInt();
		col=sc.nextInt();
		
		arr=new int[row][col];
		
		System.out.println("Enter "+row+"x"+col+" matrix value");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		TwoDArray twod=new TwoDArray();
		//twod.compileTime();
		twod.runTime();
				
		
	}

}

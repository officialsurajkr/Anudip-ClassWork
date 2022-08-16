package arraydemo;

import java.util.Scanner;

public class MatrixAddition 
{
	public static void main(String[] args) {
		
	
	int row ,col;
	int arr[][],arr2[][],arr3[][];
	
	Scanner sc=new Scanner(System.in);
	
	//taking row and col from user
	System.out.println("Enter Row and Col ");
	row=sc.nextInt();
	col=sc.nextInt();
	
	//Assign the size of array acc. to user
	arr=new int[row][col];
	arr2=new int[row][col];
	arr3=new int[row][col];
	
	//taking first matrix data from user
	System.out.println("Enter first "+row+"x"+col+" matrix value");
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<col; j++)
		{
			arr[i][j]=sc.nextInt();
		}
		
	}
	
	//taking second matrix data from user
		System.out.println("Enter Second "+row+"x"+col+" matrix value");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr2[i][j]=sc.nextInt();
			}
			
		}
		
		//adding first and second array
				
				for(int i=0; i<row; i++)
				{
					for(int j=0; j<col; j++)
					{
						arr3[i][j]=arr[i][j]+arr2[i][j];
					}
					
				}
				
				
				//print array after addition
				System.out.println("Array after addition ");
				for(int i=0; i<row; i++)
				{
					for(int j=0; j<col; j++)
					{
						System.out.print(arr3[i][j]+" ");
					}
					System.out.println();
				}
	
	
	
	

}
}
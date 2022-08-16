package arraydemo;

public class JaggedArray 
{
	public static void main(String[] args) 
	{
		int i,j;
		int arr[][]=new int[3][]; //declaring array with 3 row
		
			arr[0]=new int [3];  //first row three column
			arr[1]=new int [4];	// Second row 4 column
			arr[2]=new int [2]; //third roe 2 column
			
			//Initializing a jagged array
			int count=0;
			for(i=0; i<arr.length; i++)
			{
				for(j=0; j<arr[i].length; j++)
				{
				arr[i][j]=count++;
				}
			}
			
			//printing the data of a jagged array
			for(i=0; i<arr.length; i++)
			{
				for(j=0; j<arr[i].length; j++)
				{
				System.out.print(arr[i][j]+" ");
				}
				System.out.println();  //new line
			}
		
		
	}

}

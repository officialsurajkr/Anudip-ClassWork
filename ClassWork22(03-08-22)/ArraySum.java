//write a program to calculate sum of 5 elements in an array

package arraydemo;

public class ArraySum
{
	public static void main(String[] args) 
	{
		int arr[]= {2,3,4,2,6};
		int sum=0;
	/*	
		for(int i=0 ; i<arr.length; i++)
			
		{
			sum=sum+arr[i];	
		}
		System.out.println("Sum of Given Number is :"+sum);
		*/
	
		//Using  for each loop
		
		for(int var : arr)
		{
			sum=sum+var;
		}
		System.out.println("Sum of given number: "+sum);
		
	}

}

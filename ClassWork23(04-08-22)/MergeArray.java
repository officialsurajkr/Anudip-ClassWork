/*
 * wap to merger two array in to another array.
 */

package thursdaylab;

public class MergeArray 
{
	public static void main(String[] args) 
	{
		int p=5;
		
		
		
		int arr[]= {2,3,4,2,4};
		int arr2[]= {5,8,9,4,0};
		
		
		int length=arr.length+arr2.length;
		
		int arr3[]=new int[length];
		
		//storing first array data in third array
		for(int i=0; i<arr.length ; i++)
		{
			arr3[i]=arr[i];	
		}
		for(int i=0; i<arr2.length ; i++)
		{
			arr3[p]=arr2[i];
			p++;
			
		}
		//print
		
		System.out.println("After mergeing the array: ");
		for(int i=0; i<length ; i++)
		{
			System.out.print(arr3[i]+" ");
			
		}
		
		
		
	}
	
}

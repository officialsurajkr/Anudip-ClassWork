package arraydemo;

public class MaxMinUsingMethod 
{
	//Implementing  return an array
	
	public static int[] get()
	{
		int arr[]= {10,20,30};
	//	return new int[] {2,4,6,8}
		
		return arr;
	}
	
	
	
	//using method in array
	
	static void minElement(int ar[])
	{
		int min=ar[0];
		
		for(int i=0 ; i<ar.length; i++)
		{
			if(min>ar[i])
				min=ar[i];
		}
		System.out.println("minimum number in given array is "+min);
		
	}
	
	public static void main(String[] args)
	{
		/*
		int a[]= {33,6,3,7,9,44};    //passing array in method
				minElement(a);
		*/
		
		//passing anonymous array to method
		
		minElement(new int[] {24,5,2,44,1,7});
		
		int a[]=get();  //Storing return value in array
		for(int var:a)   //using for each loop printing returning value
		{
			System.out.println(var);
		}
		
		
	}

}

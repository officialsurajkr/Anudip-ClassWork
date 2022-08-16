
//Wap to find out total number of even and odd numbers from an array.

package arraydemo;
import java.util.Scanner;
public class CheckOddEven 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		int even=0;
		int odd=0;
		//taking data in array form
		int arr[]= {6 ,12, 3 ,5, 6, 12};
		
		for(int i=0 ; i<arr.length ; i++)
		{
			//checking even count number
			if(arr[i]%2==0)
			{
				even++;
				
			}
			
			//condition for odd
			else
			{
				odd++;
			}
		
		}//end of loop
		
		System.out.println("Odd Count  "+odd);
		System.out.println("Even Count "+even);
		System.out.println("=====================================");
		
		System.out.println("Enter 5 Number");
				int arr2[]=new int[5];
				for(int i=0 ; i<arr2.length; i++)
				{
					arr2[i]=sc.nextInt();		
				}
		
	}
	
	

}

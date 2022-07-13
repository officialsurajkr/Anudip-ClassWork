
//W.a.p  to print even number in between 1 to n
package basicprograms;
import java.util.Scanner;

public class EvenNumber
{
	
	public static void main(String[] args) 
	{
		//int i,n;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Range:");
		  int n=sc.nextInt();
		 
//		 for(int i=1; i<n; i++)
//		 {
//			 if(i%2==0)
//				
//				 System.out.println(i);
//		
//		 }
		  
		  for(int i=2; i<=n; i=i+2)
		  {
			  System.out.println(i);
			  
		  }
	}
	

}

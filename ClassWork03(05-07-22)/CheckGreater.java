//Check Greater Number Using Scanner Class..
import java.util.Scanner;
public class CheckGreater
{
	
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ");
		int n1=sc.nextInt();
		
		System.out.println("Enter Second Number ");
		int n2=sc.nextInt();
		
		if(n1 > n2)
		{
			System.out.println( n1 +" is greater then "+ n2);
		}
		 else if(n2 > n1)
		{
			System.out.println(n2 + " is greater then "+ n1);
		}
		else
		{
			System.out.println("Both are Equal");
		}
		
		
	}
}
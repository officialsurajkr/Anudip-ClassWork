package basicprograms;
import java.util.Scanner;

public class StarPatter01Reverse 
{
	public static void main(String[] args)
	{
		int i,j,num; //variables for loop
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of Rows");
		num=sc.nextInt();
		
		
		for(i=1 ; i<=num;i++)  //it will print no of rows 
		{
			for(j=i ; j<=num; j++) //this loop print no of column
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}

//program for find Area & perimeter of Rectangle

import java.util.Scanner;
public class AreaPerimeter
{
	
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);  //Creating Scanner Object
		
		System.out.println("Enter the Length of Rectangle");
			int l=sc.nextInt();
			
		System.out.println("Enter the Breadth of Rectengle");
			int b=sc.nextInt();
			
			System.out.println("Area of Rectangle is "+( l*b));   //Calculating Area of Rectangle
			
			System.out.println("perimeter of Rectangle is "+( 2*l+b)); //Calculating Perimeter of Rectangle
	}
}

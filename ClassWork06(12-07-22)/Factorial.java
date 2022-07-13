//w.a.p to calculate factorial number from 1 to n.

package basicprograms;
import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
    //Counter Variable for loop
		int i ,num,fact=1; //Variable for loop
		
		Scanner sc=new Scanner(System.in); // creating Scanner Object
		System.out.println("Enter a  Number");
		num=sc.nextInt();
		//Calculating Factorial
		for(i=1;i<=num;i++)
		{    
		      fact=fact*i;    
		} 	   
		System.out.println("Factorial of "+num+" is "+fact);
	}

}

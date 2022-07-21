
//W.a.p to print Addition , Subtraction, Multiplication, Division Operation using method and Switch.

package basicprograms;
import java.util.Scanner;

public class Calculater
{
	public static int addition(int a , int b)  //addition method
	{
		int c= a+b;
		return c;
	}
	
	public static int substraction(int a, int b)  //Subtraction method
	{
		int c=a-b;
		return c;
	}
	
	public static int multiplication(int a , int b) //multiplication method
	{
		int c=a*b;
		return c;
	}
	
	public static int division(int a , int b)  //division method
	{
		int c= a/b;
		return c;
	}
	
	
	public static void main(String[] args)   //main method
	{
		int choice , num1 , num2; //Counter variable
		
		Scanner sc=new Scanner(System.in);   //Scanner class Object
		
		do{
		System.out.println("Press 1 for Addition\n"+"Press 2 for Subtraction\n"+
		"Press 3 for Multiplication\n"+"Press 4 for division\n"+"Press 5 for Quit ");
		
		System.out.println("=============================");
		System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			System.out.println("=============================");
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Two Number:");
				num1=sc.nextInt();
				num2=sc.nextInt();
				int addResult=Calculater.addition(num1, num2);     //Calling addition method w.t.h of ClassName
				System.out.println("Addition Value is "+addResult);  //return value of addition method will store in addResult
				System.out.println("=============================");
				break;
				
			case 2:
				System.out.println("Enter Two Number:");
				num1=sc.nextInt();
				num2=sc.nextInt();
				int subResult=Calculater.substraction(num1, num2);  
				System.out.println("Subtraction Value is "+subResult);  
				System.out.println("=============================");
				break;
				
			case 3:
				System.out.println("Enter Two Number:");
				num1=sc.nextInt();
				num2=sc.nextInt();
				int multiResult=Calculater.multiplication(num1, num2);
				System.out.println("Multiplication Value is "+multiResult);
				System.out.println("=============================");
				break;
				
			case 4:
				System.out.println("Enter Two Number:");
				num1=sc.nextInt();
				num2=sc.nextInt();
				int divResult=Calculater.division(num1, num2);
				System.out.println("Division Value is "+divResult);
				System.out.println("=============================");
				break;
				
			case 5:
				System.out.println("Quit Succesfully....");
				
				break;	
				default:
					System.out.println("Wrong Choice..Chose option from given");
			}//end of switch
			}//end of do
				while(choice!=5);
			System.out.println("Thank You");
		
					
	}
}

package basicprograms;
import java.util.*;

public class CountNoOfDigit 
{
	public static void main(String[] args) 
	{
		int count=0 , num ,temp;  //counter variable for loop
		Scanner sc=new Scanner(System.in);  // creating Scanner Object
		System.out.println("Enter a Number: ");
			num=sc.nextInt();
			temp=num;
			for(;num>0;)  //calculating No. of Digit
			{
				count++;
				num=num/10;
			}
			System.out.println("Total no. of  Digits in "+ temp + " is "+ count);
	}

}

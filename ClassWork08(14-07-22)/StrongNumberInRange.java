//w a p to print all strong number 1 to 500

package basicprograms;
public class StrongNumberInRange {

	public static void main(String[] args) {
		
		System.out.println("Strong Number in between 1 to 500 is ");
		
		int i,j,temp,sum,fact,rem;
		for( i=1;i<=500;i++) 
		{
		 sum=0;//initialize the sum variable with 0 
		 temp=i;//store i in temp for future use
		 
		
		while(temp!=0)
		{
			 rem=temp%10; // taking the last digit
			 fact=1;
			 
			// for loop for calculate factorial
			for( j=1;j<=rem;j++)
		{
			fact=fact*j;//factorial logic
		}
		sum+=fact;
		temp=temp/10;
		}
		// checking for strong number
		if(sum==i)
		System.out.println(" "+i);
			
		}

	}

}
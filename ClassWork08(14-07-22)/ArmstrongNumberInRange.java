
//W.a.p to print Armstrong Number between 1 to 500.

package basicprograms;
public class ArmstrongNumberInRange
{
	public static void main(String[] args) 
	{
		int i,num,rem,count=0,sum=0;
		System.out.print("Armstron NUmbet Between 1 to 500 is ");
		for(i=1 ; i<=500 ; i++)
		{
			
			num=i;
			while(num!=0)  //Checking Armstrong Number
			{
				rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
			sum=0;
			
		}
		
	}
}
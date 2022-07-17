/*
 	W.a.p to print reverse Pyramid Star Pattern
 			* * * * *
 			 * * * *
 			  * * *
 			   * *
 			    * 
 
 */

package basicprograms;

public class ReverseStarPatternPyramid 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		
		for(i=5;i>=1;i--)
		{
			for(j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

/*wap to check the string are palindrome or not?
ex. madam  output-the string are palindrome */


package string;

public class StringPalindrome
{
	public static void palindrome(String str)
	{
	
		String rev ="";
	
		int length=str.length();		
		
		for(int i=length-1; i>=0 ; i--)
		{
			rev=rev+str.charAt(i);	
		}

		if(str.equals(rev))
		{
			System.out.println(str+" is plindrome");
		}
		else
		{
			System.out.println("this is not plindrome");	
		}
		
	}
	
	public static void main(String[] args) 
	{
		String str="MADAM";
		palindrome(str);
	}
}

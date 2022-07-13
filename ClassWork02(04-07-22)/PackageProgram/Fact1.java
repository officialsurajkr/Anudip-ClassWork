package pack1;
public class Fact1
{
	public void meth1()
	{	
		 int i,fact=1;  
	int number=5;//It is the number to calculate factorial    
	for(i=1;i<=number;i++){    
      fact=fact*i;    
	} 	   
	System.out.println("Factorial of "+number+" is: "+fact);    
	}  
}
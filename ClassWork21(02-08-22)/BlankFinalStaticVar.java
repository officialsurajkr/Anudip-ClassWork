package oops;

public class BlankFinalStaticVar 
{
	
	//Static final varible
	static final int data;
	
	static
	{
		data=45;
	}
	
	//implementation of final parameter
	
	int Cube(final int n)
	{
		//n=n+1; the final local variable n cannot be assigned.
		//it must be blank and not using a compound assignment
		
		return n*n*n;
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		System.out.println(BlankFinalStaticVar.data);
	}

}

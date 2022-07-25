package oops;

class Addition
{
	public void add(int a)
	{
		System.out.println("Addition Value of One Parameter:"+(a+10));
	}
	
	public void add(int a,int b, int c)
	{
		System.out.println("Addition Value of Three Parameter:"+(a+b+c));
	}
	
	public void add(int a,double b)
	{
		System.out.println("Addition Value of  Parameter(int, double):"+(a+b));
	}
	
	public void add(double b, int a)
	{
		System.out.println("Addition Value of  Parameter(double, int):"+(a+b));
	}
	
}

public class MethodOverLoadingDemo 
{
	public static void main(String[] args)
	{
		
		Addition addition=new Addition();
				addition.add(2);
				addition.add(2,4, 6);
				addition.add(2, 2.4);
				addition.add(2.4, 2);
	}

}

package abstractiondemo;

interface Drawable
{
	void draw();
	default void message() 
	{
		System.out.println("since java 8 , we can specify method body using default");
	}
	
	static int multiply(int a, int b) 
	{
		
		
		return(a*b);
		
	}
}

class Circle implements Drawable
{

	@Override
	public void draw() 
	{
		System.out.println("Drawing Circle");
		
		
	}
	
}

public class DefaultMethod
{
	public static void main(String[] args)
	{
		Circle circle=new Circle();
		circle.draw();
		circle.message();
		
		System.out.println(Drawable.multiply(10, 10));
		
	}

}

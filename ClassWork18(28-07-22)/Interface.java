package abstractiondemo;

interface Printable
{
	int x=0;
	
	void dispaly();
	void fun();
}
class Paint implements Printable
{

	@Override
	public void dispaly() 
	{
	System.out.println("Display method Called");	
		
	}

	@Override
	public void fun()
	{
		System.out.println("Fun method Called");
		
		
	}
	
}

public class Interface
{
	public static void main(String[] args)
	{
		//We can't instantiate interface,but you can create reference variable
	//	Printable pt=new Printable(); // will get error
		
		Printable pt=new Paint();
			pt.dispaly();
			pt.fun();
		
		Paint p=new Paint();
		p.dispaly();
		p.fun();
		
	}

}

package oops;

public class CountObjects
{
	//int count=0;    //instance variable - it will allocate diff. memory location for diff. objects
	
	static int count=0;// static variable-it will allocate only one memory location for every object creation
	
	public CountObjects()
	{
		++count;
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		CountObjects cobj1=new CountObjects();
		CountObjects cobj2=new CountObjects();
		CountObjects cobj3=new CountObjects();
		CountObjects cobj4=new CountObjects();
		CountObjects cobjd=new CountObjects();
		
		
	}

}

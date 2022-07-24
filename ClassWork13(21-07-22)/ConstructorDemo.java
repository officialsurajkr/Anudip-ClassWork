package oops;

public class ConstructorDemo
{
	//instance variable
	int Id;
	String name,address;
	long phno;
//	//Non parameterized constructor
//	public ConstructorDemo() 
//	{
//		int id=0;
//		String name=null;
//	}
	
	
	//parameterized Constructor
	
	public ConstructorDemo(int id , String n , String add, long ph )
	{
		Id=id;
		name=n;
		address=add;
		phno=ph;
		
	}
	
	public void getData()
	{
		System.out.println(" id:"+Id+" Name:"+name+" addreass:"+address
				+" PhNo:"+phno);
	}
	
	public static void main(String[] args) 
	{
		//ConstructorDemo cobj=new ConstructorDemo();  //for non parametarised constructor
		
		
		//parameterized constructor
		
		ConstructorDemo cobj1=new ConstructorDemo(101,"Suraj","Dhanbad",967356527);
						cobj1.getData();
		
		ConstructorDemo cobj2=new ConstructorDemo(102,"ramesh","Asansol",536522829);
						cobj2.getData();
		
	}
	

}

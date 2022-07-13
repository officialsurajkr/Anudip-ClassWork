import pack1.*;  //importing ClassA in ClassB
public class ClassB
{
	public static void main(String []args)  //Main Method
	{
		ClassA aobj=new ClassA();     //Creating ClassA object
		aobj.meth1();     //Calling meth1 from classB
	}

package oops;


class Bike
{
	final void speed()
	{
		System.out.println("150kmph");
		
	}
	
}

public class FinalKeywordDemo extends Bike  //the type FinalKeywordDemo cannot override
{
//	void speed()  //cannot override the final method from bike
//	{
//		System.out.println("150kmph");
//	}
	
	final int a=100; //final variable
	
	public static void main(String[] args)
	{
		
		FinalKeywordDemo demo=new FinalKeywordDemo();
		// demo.a=400; //final field FinalKeywordDemo cannot be assingn
		System.out.println(demo.a);
		
		demo.speed();
	}

}

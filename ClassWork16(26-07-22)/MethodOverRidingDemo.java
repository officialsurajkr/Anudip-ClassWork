package oops;

class ParentBank
{
	public void loneIntrest()
	{
		System.out.println(" 9% increment");
	}
}

class ChildSbi extends ParentBank
{
	public void loneIntrest()
	{	
		System.out.println("Welome to Sbi Bank");
		System.out.println(" 5 % intrest");
	}
}

class ChildAxis extends ParentBank
{
	public void loneIntrest()
	{	
		System.out.println("Welome to Axis Bank");
		System.out.println(" 12 % intrest");
	}
}

class ChildHdfc extends ParentBank
{
	public void loneIntrest()
	{	
		System.out.println("Welome to Hdfc Bank");
		System.out.println(" 8.5 % intrest");
	}
}


public class MethodOverRidingDemo
{
	public static void main(String[] args) 
	{
//		ChildSbi sbi=new ChildSbi();
//				sbi.loneIntrest();
		
		
//		ParentBank pbank=new ChildSbi();
//		pbank.loneIntrest();
		
//Holding Child Class Object with Parent Class reference and with
//that reference we are calling child Class methods using Overriding property
//this is called Upcasting
		ParentBank pbank;
		
		pbank=new ChildSbi();   
		pbank.loneIntrest();
		
		pbank=new ChildAxis();
		pbank.loneIntrest();
		
		pbank=new ChildHdfc();
		pbank.loneIntrest();
		
		
	}

}

package oops;

class Bank     //parent class
{
	public void loneIntrest()
	{
		System.out.println("9% Intrest Rate");
	}
}
class Sbi extends Bank   //child class
{
	public void pensionScheam()
	{
		System.out.println("minimum 5 year scheam you need to take");
	}
	
}

class Axis extends Bank    //another child class
{
	public void fixedDeposit()
	{
		System.out.println("tenor is 5 year");
	}
}

public class HierarchalInheritance 
{
	public static void main(String[] args) 
	{
			Sbi sbi=new Sbi();
			sbi.loneIntrest();
			sbi.pensionScheam();
			
			
			Axis axis=new Axis();
			axis.loneIntrest();
			axis.fixedDeposit();
	}

}

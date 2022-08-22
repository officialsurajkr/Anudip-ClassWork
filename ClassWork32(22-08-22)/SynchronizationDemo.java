package multithreding;

//shared object
class PrintData
{
//	void multiplication(int n)  //method not Synchronized--both thread executing simultaneously
	synchronized void multiplication(int n) //synchronized method-one method complete execute then 2nd method starts
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of for loop
			
	} //end of method
	
}
	
class Thread1  extends Thread
{
	PrintData t;
	public Thread1(PrintData t)
	{
		this.t=t;
	}

	
	public void run()
	{
		t.multiplication(5);	
	
	}
}
class Thread2  extends Thread
{
	PrintData t;
	public Thread2(PrintData t)
	{
		this.t=t;
	}

	public void run()
	{
		t.multiplication(100);
	}

}


public class SynchronizationDemo 
{
	public static void main(String[] args)
	{
		//only one object of PrintData class
		PrintData pd=new PrintData();
		
		//Two thread object which will share above object
		Thread1 t1=new Thread1(pd);
		Thread2 t2=new Thread2(pd);
		
		
		
		
	
		t1.start();
		t2.start();
		
	}

}

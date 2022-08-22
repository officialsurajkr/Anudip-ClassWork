package multithreding;

//shared object
class PrintDataInfo
{

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
			
	} //end of synchronized method
	
}
	



public class SynchronizationWithAnonymous 
{
	public static void main(String[] args)
	{
		//only one object of PrintData class
		PrintDataInfo pd=new PrintDataInfo();
		
		//Anonymous class
		Thread t1=new Thread()
		{
			public void run()
			{
				pd.multiplication(5);
			}
		};
		
		Thread t2=new Thread()
				{
				public void run()
				{
					pd.multiplication(100);
				}
				};
		
	
		t1.start();
		t2.start();
		
	}

}

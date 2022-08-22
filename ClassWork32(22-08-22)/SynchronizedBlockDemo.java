package multithreding;

class SynchoronizedBlock
{
	void multiplication(int n)
	{
		System.out.println("Outside of synchronized block");
		
		synchronized (this)  //block
		{
			for(int i=1; i<=5; i++)
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
			}//end of for
		}//end of block
		System.out.println("rest of code which not to synchonized");
	}//end of method
}

public class SynchronizedBlockDemo 
{
	public static void main(String[] args) 
	{
		SynchoronizedBlock sb=new SynchoronizedBlock();
		
		//Anonymous Thread class
				Thread t1=new Thread()
				{
					public void run()
					{
						sb.multiplication(5);
					}
				};
				
				Thread t2=new Thread()
						{
						public void run()
						{
							sb.multiplication(100);
						}
						};
				
			
				t1.start();
				t2.start();
				
		
	}

}

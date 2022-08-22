package multithreding;

public class DeadLockDemo
{
public static void main(String[] args) 
	{
		final String resource1="paper";
		final String resource2="pen";	
		
		//Thread 1: t1 lock resouece1:paper
		Thread t1=new Thread()
				{
					public void run()
					{
						synchronized (resource1)
						{
							System.out.println("t1 looked resource1:paper");
							try 
							{
								Thread.sleep(100);
							} catch (Exception e) 
							{
								e.printStackTrace();
							}
							//Thread 1:t1 trying to lock resource 2:pen
							synchronized (resource2) 
							{
								System.out.println("wanted to lock resource2:pen ");
							}
						}
					}//end of run()
				};
				
				
				//Thread 2: t2 lock resouece2:pen
				Thread t2=new Thread()
						{
							public void run()
							{
								synchronized (resource2)
								{
									System.out.println("t2 looked resource2:pen");
									try {
										Thread.sleep(100);
									} catch (Exception e) 
									{
										e.printStackTrace();
									}
									
									//Thread 2:t2 trying to lock resource 1:paper
									synchronized (resource1) 
									{
										System.out.println("wanted to lock resource1:paper ");
									}
								}
							}//end of run()
						};
						
						
						t1.start();
						t2.start();
		
	}


}

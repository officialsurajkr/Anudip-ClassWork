package multithreding;

public class ThreadWithImplementing implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is running");
	}
	
	
	public static void main(String[] args) 
	{
		 ThreadWithImplementing twi=new  ThreadWithImplementing();
		 Thread t1=new Thread(twi,"Thraed");
		 t1.start();
	}
}

package multithreding;

public class ThreadDemo extends Thread
{
	public ThreadDemo(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println("Thread is running...."+
	Thread.currentThread().getName()+
	"Priority "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) 
	{
		 ThreadDemo  t1=new  ThreadDemo ("first-thread"); //new state
		 ThreadDemo  t2=new  ThreadDemo ("second-thread");
		 ThreadDemo  t3=new  ThreadDemo ("third-thread");
		 ThreadDemo  t4=new  ThreadDemo ("fourth-thread");
		 ThreadDemo  t5=new  ThreadDemo ("fifth-thread");
		 t1.start(); //runnable state
		 t2.start();
		 t3.start();
		 t4.start();
		 t5.start();
		
	}

}

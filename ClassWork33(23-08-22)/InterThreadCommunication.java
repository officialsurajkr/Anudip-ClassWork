package multithreding;

class Account
{
	int accBalance=10000;
	
	synchronized void withdraw(int amount)
	{
		if(this.accBalance<amount)
		{
			System.out.println("waiting for deposit");
			try 
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
			
		}
		
			this.accBalance=accBalance-amount;
			System.out.println(amount+" withdraw has done Successfully");
		
	}//end of withdraw method
	
	
	
	synchronized void deposit(int amount)
	{
		System.out.println("Starting deposit");
		this.accBalance=accBalance+amount;
		System.out.println(amount+" Deposited Succesfully");
		//notify();
		notifyAll();
	}
	
	synchronized void displayBalance()
	{
		try 
		{
			wait(400);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Remaining Balance "+ this.accBalance);
		
	}
}

public class InterThreadCommunication
{
	public static void main(String[] args) 
	{
		Account ac=new Account();//only one lock
		
		new Thread()
		{
			public void run()
			{
				ac.withdraw(15000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				ac.deposit(20000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				ac.displayBalance();
			}
		}.start();
	}
	}
	
	
	
	

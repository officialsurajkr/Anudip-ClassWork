package basicprograms;

public class SwitchExample
{
	
	
	public static void main(String[] args)
	{
		int choice=2;
		
		switch(choice)
		{
		
		case 1: 
			System.out.println("this is case 1");
			break;
		case 2:
			System.out.println("this is case 2");
			break;
		case 3:
			System.out.println("this is case 3");
			break;
		case 4:
			System.out.println("this is case 4");
			break;
		default:
			System.out.println("Wrong Input");
			
		}//end of switch statement
		System.out.println("end of Switch");

	}
}

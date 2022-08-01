package interfacetask;

interface LibraryUser  //interface class
{
  //interface methods
	void registerAccount(int age);
	void requestBook(String bookType);

}

class KidUser implements LibraryUser  //taking class for implimetation of interface methods
{
  //intance Variavle
	int age;
	String bookType;

	@Override
	public void registerAccount(int age)
	{
		this.age=age;
		
		//condition for kids accouts
		if(age<12)
		{
			System.out.println("You have successfully registerd under Kids Accounts");
		}
		else
		{
			System.out.println("Sorry, Age must be less then 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook(String bookType) 
	
	{
		this.bookType=bookType;
		if(bookType.equals("Kids"))   //condition for issue book
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops you are allowed to take only kids books");
		}
		
	}
	
}


class AdultUser implements LibraryUser
{
	
	int age;
	String bookType;
	
	
	@Override
	public void registerAccount(int age)
	
	{
		this.age=age;
		if(age>12)
		{
			System.out.println("You have successfully registerd under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
		
	}

	@Override
	public void requestBook(String bookType) 
	{
		this.bookType=bookType;
		if(bookType.equals("Fiction"))
		{
			System.out.println("Book issued successfully,please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops,You are allowed to take only adult Fiction books");
		}
		
		
	}
	
}

public class LibraryInterfaceDemo      //main classs
{
	public static void main(String[] args)   //main method
	{
  //creating kidUser object with kiduser reference
		KidUser kiduser1= new KidUser();
    //passing value acccording to questions
		kiduser1.registerAccount(10);
		kiduser1.requestBook("Kids");
		
		System.out.println(" ");
		
		KidUser kiduser2= new KidUser();
		kiduser2.registerAccount(18);
		kiduser2.requestBook("Fiction");
		
		System.out.println("==============================");
		//createing onjects for AdultUser and passing values acc.to Question
		AdultUser adultuser1= new AdultUser();
		adultuser1.registerAccount(5);
		adultuser1.requestBook("Kids");
		
		System.out.println(" ");
		
		AdultUser adultuser2= new AdultUser();
		adultuser2.registerAccount(23);
		adultuser2.requestBook("Fiction");
		
		
		
		
		
		
		
	}
	

}

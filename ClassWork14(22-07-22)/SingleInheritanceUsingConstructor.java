package oops;


class Users
{
	int id;
	String name,address;
	
	public Users(int id , String name, String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void Display()
	{
		System.out.println("Id :"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("Address :"+this.address);
	}
}


//Sub/child/derived

class Employe extends Users
{
	
	double salary;
	String designation;
	public Employe(int id , String name, String address,double salary,String designation)
	{
	super(id,name,address);
	this.salary=salary;
	this.designation=designation;
	}
	public void Display()
	{
		super.Display();
		System.out.println("Salary: "+this.salary);
		System.out.println("Designation: "+this.designation);
		
	}
	
}

public class SingleInheritanceUsingConstructor
{
	public static void main(String[] args) 
	{
		Employe emp=new Employe(101,"ram","delhi",20000,"SE");
				emp.Display();
		
	}

}

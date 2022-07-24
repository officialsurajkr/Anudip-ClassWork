package oops;

public class Student
{
	int id;  //instance variable
	String name,address;
	long phno;
	
	
	public void setData(int i , String n,String add, long ph )
	{
		id=i;  //local variable
		name=n;
		address=add;
		phno=ph;	
	}
	
	public void getData()
	{
		System.out.println(" id:"+id+" Name:"+name+" addreass:"+address
				+" PhNo:"+phno);
	}
	
	
	
	public static void main(String[] args) 
	{
		//create object / class instantiation
		Student student =new Student(); //creating instance(object)
		System.out.println(student);
		
		
		//using method (secure)
		
		student.setData(101, "Suraj", "Dhanbad" , 9572645390L);
		student.getData();
		
		System.out.println("============");
		
		
		student.setData(102, "Kishan", "Delhi", 9867543429L);
		student.getData();
		
		System.out.println("============");
		
		student.setData(103, "Mukesh", "Mumbai", 9908976429L);
		student.getData();
		
		
	/*
		//using instance of class(it is not secure)
		student.id=101;
		student.name="Suraj Kumar ";
		student.address="Dhanbad";
		student.phno= 9572645390L;
	
		System.out.println(" id:"+student.id + " Name:"+student.name
				+ " Address:"+student.address +" Phno:"+student.phno);
		*/
	}

}


package oops;

import java.util.Scanner;

public class Students
{
	//instance variable
		int id;
		String name,address;
		long phno;
		 static	String institute;//Static Variable
		
		 //static block-it will execute before main method always
		static
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the your Institute Name");
			institute=sc.nextLine();
			
		}
		 
		 
		 
		//parameterized Constructor
		
		public Students(int id , String name , String address, long phno )
		{
			//when instance variable and local variable having same name 
			//than we use this keyword to differentiate them
			this.id=id;
			this.name=name;
			this.address=address;
			this.phno=phno;
			
		}
		
		public void display()
		{
			System.out.println("Welcome "+this.name);
		}
		
		public static void changeInstitueName()  //static method
		{
			institute="Anudip Foundation";
		}
		
		public void getData()
		{
			//this.display();
			display(); //compiler will change this line with this.display();
			System.out.println(" id:"+id+" Name:"+name+" addreass:"+address
					+" PhNo:"+phno+" Institute Name:"+institute);
		}
		
		public static void main(String[] args)  //main method
		{
				Students std1=new Students(101,"Suraj", "Dhanbad",95643543);
				std1.getData();
				
				//invoking Static method
				Students.changeInstitueName();
				Students std2=new Students(102,"Anand", "bihar",95643543);
				std2.getData();
				
				Students std3=new Students(103,"Mohan", "Delhi",95643543);
				std3.getData();
		}

}

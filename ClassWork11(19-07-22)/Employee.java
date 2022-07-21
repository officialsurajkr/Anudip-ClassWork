/* create class employee,declare variable empId,empName,basicSalary.
  ,designation declare methods setData() to set the employee information. 
  create method getAppraisal() method to calculate the incremenet
  appraisal.if any employee served minimum 1year,provide 10%
  increment. declare calculateTA() to calculate travel allowance.
  if that employee designation is manager then 3000 ta else 1000
     ta will be provided.
  */

package oops;
import java.util.Scanner;

public class Employee
{
	//instance variable
	String empName,designation;
	int empId,joinyear,currentyear;
	float basicSal;
	
	
	
	
	
	
	public void setData( String ename,int eid, float bsal,String dsn,int jy,int cy )
	{
		//local variables
		empName=ename;
		empId=eid;
		basicSal=bsal;
		designation=dsn;
		joinyear=jy;
		currentyear=cy;
	}
	
	//calculating balance increment condition
	public float getApprisal()
	{
		if(currentyear-joinyear>1)
		{
			 float Salary=basicSal+(basicSal*10/100);
			 return Salary;
		
		}
		else
		{
			return basicSal;
		}
	}
		//checking travel allowance condition
		public int TravelAllowance()
		{
			int ta=0; //initially taking ta as zero
			 if(designation.equals("manager") || designation.equals("MANAGER"))
			 {
				 ta=3000;
			 }
			 else {
				 ta=1000;
			 }
			 
			 return ta;	
		}
			//displaying given user info in Display method
	public void Display()
	{
		System.out.println("Emp Name: "+empName);
		System.out.println("Emp Id: "+ empId);
		System.out.println("Emp Basic Salary: "+basicSal);
		System.out.println("Emp Designation:"+designation);
		System.out.println("Joining year: "+joinyear);
		System.out.println("Current year:"+currentyear);
		
			float result =getApprisal();  //by using this keyword calling getApprisal method
		System.out.println("Incremented balance:"+result);
		
		int travel=TravelAllowance();  //return ta will store in travel
		System.out.println("Travel Allowance:"+travel);
		
	}
	
	
	public static void main(String[] args)  //Main  method
	{	
		Scanner sc=new Scanner(System.in);  //Scanner class object
		//taking inputs from user
		System.out.println("Enter the Employe Name:");
		String ename=sc.next();
		
		System.out.println("Enter the Employe Id:");
		int eid=sc.nextInt();
		
		System.out.println("Enter the Basic Salary");
		float bsal=sc.nextFloat();
		
		System.out.println("Enter Your Designation");
		String dsn=sc.next();
		
		System.out.println("Enter the joining year");
		int jy=sc.nextInt();
		System.out.println("Enter the Current year");
		int cy=sc.nextInt();
		
		
		
		
		Employee emp=new Employee(); //Creating class object/instantiation
			
		emp.setData(ename, eid, bsal, dsn, jy, cy);  //calling methods w.t.h of emp reference
		emp.Display();
			
		
		
	}

}

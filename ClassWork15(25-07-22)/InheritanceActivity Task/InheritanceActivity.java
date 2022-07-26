package inheritanceTask;

class Employee
{
	//instance variable
	long employeeId;
	String employeeName,employeeAddress;
	long employeePhno;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	
//parameterized Constructor to initialized employeeId,employeeName,employeeAddress,employeePhno,baiscSalary
	public Employee(long employeeId ,String employeeName, String employeeAddress,
			long employeePhno,double basicSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress=employeeAddress;
		this.basicSalary=basicSalary;
	}
	
	//using toString method 
	@Override
	public String toString() {
		return "Trainee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeePhno=" + employeePhno + ", basicSalary=" + basicSalary
				+ ", specialAllowance=" + specialAllowance + ", Hra=" + Hra + "]";
	}
	
	
	//Calculating salary for Manager and Trainee
	public void calculateSalary()
	{
	
		double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
				System.out.println(this.employeeName+"'s Salary:"+salary);
	}
	
	//Calculating Transport Allowance for Manager and Trainee
	public void calculateTransportAllowance()
	{
		double transportAllowance=basicSalary*10/100;
		System.out.println("Transport Allowance:"+transportAllowance);
		
	}
	
}  //end of parent class

class Manager extends Employee 
{
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhno,
			double basicSalary)
	{
		//Constructor Chaining
		super(employeeId, employeeName, employeeAddress, employeePhno, basicSalary);	
	}
	public void calculateTransportAllowance()
	{
		double transportAllowance=basicSalary*15/100;
		System.out.println("Transport Allowance:"+transportAllowance);
				
	}

}



class Trainee extends Employee
{
	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhno,
			double basicSalary)
	{
		super(employeeId, employeeName, employeeAddress, employeePhno, basicSalary);
				
	}
}

public class InheritanceActivity
{
	public static void main(String[] args) //main method
	{
		//instance class for Manager
		Manager manager=new Manager(12345,"Peter","Chennai India",237844,65000);
		System.out.println(manager);
		   manager.calculateSalary();
		   manager.calculateTransportAllowance();
		   
		System.out.println("================================================");
		
		//instance class object for Trainee
		Trainee trainee=new Trainee(29846, "Jack","Mumbai India",442085,45000);
		System.out.println(trainee);
		     trainee.calculateSalary();
		     trainee.calculateTransportAllowance();
		     
	      	
	}

}

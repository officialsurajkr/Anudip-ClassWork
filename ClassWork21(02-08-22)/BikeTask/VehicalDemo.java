/* 
 * Create a Bike class having properties like engine, wheel, name and methods like 
 * start move break stop.Create two subclass of bikes and create the bike 
 * object as per user requirement (input). If that particular type of bike 
 * is available assign that bike to a rider. Rider should have name and 
 * license number and rider will ride the bike.
Display all the details including Car Engine details wheel details along
 with rider details.And also all the behavior (Methods ) of user given bike.
 * */


package task;
import java.util.Scanner;

class Bankk
{

	final int wheel=2;
	String bikename;
	public Bankk(String bikename) {
		super();
		this.bikename = bikename;
	}
	
}

class Userr extends Bankk
{

	String userName;
	long lincenseNo;
	public Userr(String bikename) {
		super(bikename);
		// TODO Auto-generated constructor stub
	}
	
	public void setUserDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username:");
		userName=sc.nextLine();
		System.out.println("enter lincenseNo:");
		lincenseNo=sc.nextLong();
		
	}
	
	public void display() {
		System.out.println(super.bikename+" is assigned to "+ this.userName);
        System.out.println("bike details: "+ super.wheel+ "wheeler");
	}

}
public class VehicalDemo {

	public static void main(String[] args) {
	Userr user=new Userr("KTM");
	user.setUserDetails();
	user.display();

	}

}

package abstractiondemo;

class Company
{ 
	int compId;
	String compName;
	
	Address address;  //entity reference

	public int getCompId() {
		return compId;
	}

	public String getCompName() {
		return compName;
	}

	public Address getAddress() {
		return address;
	}

	public Company(int compId, String compName, Address address) {
		super();
		this.compId = compId;
		this.compName = compName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [compId=" + compId + ", compName=" + compName + ", address=" + address + "]";
	}

	
}

public class AggregationDemo 
{
	public static void main(String[] args) 
	{
		Address add1=new Address(828205,"Dhanbad","India","Jharkhand");

		Address add2=new Address(462036,"Bhopal","India","m.p");
		
		Company company1=new Company(345, "TCS" , add1);
		Company company2=new Company (213 , "xyz", add2);
		
		System.out.println("id: "+company1.getCompId()+""+company1.getCompName()+
				company1.getAddress());
		
		
		
		
	}

}

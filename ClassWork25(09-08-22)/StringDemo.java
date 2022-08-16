package string;

public class StringDemo 
{
	public static void main(String[] args) {
		String name="Suraj";
		String name2="Suraj";
		String str="welcome";
		
		System.out.println(name==name2);
		System.out.println(name==str);
		name.concat("Kumar");
		System.out.println(name);  //because string is immutable
		
		System.out.println(name.concat("kumar"));
		
		name=name.concat(" Kumar Chauhan ");
		System.out.println(name);
		
	
		
		
		
		
		
	}

}

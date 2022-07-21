package basicprograms;

public class VowelAndConsonantWithSwitch 
{
	public static void main(String[] args) 
	{
		char A='a';
		
		switch(A)
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
			System.out.println(A + " is Vowel");
			break;
		default :
			System.out.println(A+ " is Consonant");
			
		}//end of switch
		System.out.println("end ");
	}

}

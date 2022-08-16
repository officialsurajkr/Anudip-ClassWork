package string;

public class CountVowel
{
	public static int countVowels(String str)
	  {
		int i,count=0; char ch;
		for(i=0;i<str.length();i++)
		  {
			ch=str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'
					||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			  {
				count++;
			  }
		  }
		return count;
	
	  }
	
//	}
	public static void main(String[] args) 
	{
		String str="Hell Good Moring";
		
		int count=countVowels(str);
		System.out.println("Total no of Vowel:"+count+" in "+str);
		
		
		
		
		
	}

}

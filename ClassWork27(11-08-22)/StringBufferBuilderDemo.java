package string;

public class StringBufferBuilderDemo 
{
	public static void main(String[] args) {
		
	System.out.println("Understanding StringBuilder");
	StringBuilder builder=new StringBuilder("Hello World");
	System.out.println(builder);
	
	builder.append(" I am learning ");
	System.out.println(builder);
	builder.insert(26,"java");
	System.out.println(builder);
	
	builder.insert(1," Hi ");
	System.out.println(builder);
	
	
	
	builder.reverse();
	System.out.println(builder);
	
	System.out.println("=========================================");
	
	System.out.println("Understanding StringBuffer");
	StringBuffer buffer=new StringBuffer("Hello ");
	buffer.append("World");
	System.out.println(buffer);
	System.out.println(buffer.capacity());
	char ch=buffer.charAt(4);
	System.out.println(ch);
	System.out.println(buffer.indexOf("ello"));
	System.out.println(buffer.substring(6));
	System.out.println(buffer.substring(0, 6));
	System.out.println(buffer);
	System.out.println(buffer.replace(0, 5, "Hi"));
	System.out.println(buffer.delete(0, 2));
	buffer.insert(0, "Hello");
	System.out.println(buffer);
	
	
	
	
	
	}
}

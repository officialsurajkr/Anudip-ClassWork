package filestream;
import java.io.FileOutputStream;

public class FileOutputStram 
{
public static void main(String[] args) 
{
	try {
		FileOutputStream fos=new FileOutputStream ("D:\\AnuDip\\file\\letter.txt");
			//fos.write(65);
		
		String s="Welcome to java stream";
		
		byte b[]=s.getBytes();
		fos.write(b);
			
			
			fos.close();
			System.out.println("Data Written Successfully");
		
	} catch (Exception e) {
		
	}
}
}

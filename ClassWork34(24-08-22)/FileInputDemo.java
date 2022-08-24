package filestream;

import java.io.FileInputStream;

public class FileInputDemo
{
	public static void main(String[] args) 
	{
		try {
			FileInputStream fis=new FileInputStream("D:\\AnuDip\\file\\letter.txt");
			int i;
		//	i=fis.read();
			System.out.println("\nNumber of remaining bytes is "+fis.available());
//			while((i=fis.read())!=-1)
//					{
//					System.out.print((char)i);				
//					}
			fis.read();
			fis.read();
			fis.read();
			System.out.println("\nNumber of remaining bytes is "+fis.available());
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}

}

package filestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFiledemo 
{
	public static void main(String[] args) 
	{
		FileInputStream fs=null;
		FileOutputStream os=null;
		
		try {
			fs=new FileInputStream("D:\\AnuDip\\file\\letter.txt");
			os=new FileOutputStream("D:\\AnuDip\\file\\dest.txt");
			
			int i;
			
			while((i=fs.read())!=-1)
			{
				os.write(i);
			}
			System.out.println("Copied Succesfully");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			try {
				
				if(fs!=null)
					fs.close();
				
				if(os!=null)
					os.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

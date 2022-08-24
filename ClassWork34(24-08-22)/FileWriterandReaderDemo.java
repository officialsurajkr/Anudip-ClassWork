package filestream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterandReaderDemo
{
	//file write
	public void writeOperation()
	{
		try {
			FileWriter fw=new FileWriter("D:\\AnuDip\\file\\letter.txt");
			fw.write("We are learling File writer-Reader");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Succes");
	}
	
	//File Reader
	
	public void readOperation()
	{
		try
		{
		FileReader fr=new FileReader("D:\\AnuDip\\file\\letter.txt");
		int x;
		
		while((x=fr.read())!=-1)
		{
			System.out.print((char)x); 
		}
		fr.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args)
	{
		FileWriterandReaderDemo fwr=new FileWriterandReaderDemo();
		fwr.writeOperation();
		fwr.readOperation();
	}

}

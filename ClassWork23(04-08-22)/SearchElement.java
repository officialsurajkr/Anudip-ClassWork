package arraydemo;
import java.util.Scanner;

public class SearchElement
{	
	int size,i,search,arr[];
	
	Scanner sc=new Scanner(System.in);
	public void method1()
	{
		int pos=-1;
		System.out.println("Enter the size of array");
		 size=sc.nextInt();
		 
		 
		 //instancetiate array
		 arr=new int[size];
		 
		 //initialize array
		 System.out.println("Enter "+ size+" elements in an array");
		 for(i=0; i<size;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 
		 System.out.println("Enter the elemnet you want to search for");
		 search=sc.nextInt();
		 
		 //found the element
		 
		 for(i=0; i<size; i++)
		 {
			 if(arr[i]==search)
			 {
				 pos=i;
				 break;
			 }
		 }
		 if(pos!=-1)
		 {
			 System.out.println("data found at "+(pos+1)+" position");
		 }
		 else
		 {
			 System.out.println("Data not found");
		 }
	
}
	
	
	public void method2()
	{
		boolean flag=false;
		System.out.println("Enter the size of array");
		 size=sc.nextInt();
		 
		 
		 //instancetiate array
		 arr=new int[size];
		 
		 //initialize array
		 System.out.println("Enter "+ size+" elements in an array");
		 for(i=0; i<size;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 
		 System.out.println("Enter the elemnet you want to search for");
		 search=sc.nextInt();
		 
		 //found the element
		 
		 for(i=0; i<size; i++)
		 {
			 if(arr[i]==search)
			 {
				flag=true;
				 break;
			 }
		 }
		 if(flag==true)
		 {
			 System.out.println("data found at "+(i+1)+" position");
		 }
		 else
		 {
			 System.out.println("Data not found");
		 }
	}
	
	
	public static void main(String[] args) 
	{
		
		 SearchElement se=new  SearchElement();
		 		se.method1();
		 		se.method2();

}
}

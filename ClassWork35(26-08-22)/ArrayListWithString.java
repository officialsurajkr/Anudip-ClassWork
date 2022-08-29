package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithString
{
	public static void main(String[] args)
	{
		List<String> al=new ArrayList<String>();
		
		al.add("Suraj");
		al.add("Hello World");
		al.add("India");
		al.add("I am Learning java");
		al.add("500");
		
		//print Array list
		System.out.println(al);
		//size
		System.out.println("size "+al.size());
		
		al.add("java programs");
		System.out.println(al);
		System.out.println("New size "+al.size());
		System.out.println("--------------------------------");
		
		//use for loop
		System.out.println("Arraylist using for loop"); //2nd way
		
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("--------------------------------");
		
		//use for each loop iterate arraylist
		System.out.println(" for each  loop iterate arraylist"); //3rd way
		for(String in:al)
		{
			System.out.println(in);
		}
		System.out.println("--------------------------------");
		
		
		//use while loop iterate arraylist
		System.out.println(" while  loop iterate arraylist"); //4rd way
		int count=0;
		while(count<al.size())   //while(list.size()>count)
		{
			System.out.println(al.get(count));
			count++;
		}
		System.out.println("--------------------------------");
		
		//use Iterator Interface iterate Arraylist
		System.out.println(" Iterator using for iterate arraylist"); //5th way
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("--------------------------------");
		
		//sorting arraylist in ascending order
		
		Collections.sort(al);
		System.out.println("After Sorting in ascending the value are: ");
		System.out.println(al);
		
		//sorting in descending order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After Sorting in descending the value are: ");
		System.out.println(al);
		System.out.println("--------------------------------");
		
		//adding at pacific position
		al.add(2, "Abc");
		System.out.println("after adding"+al);
		
		//remove
		al.remove(2);
		al.remove("500");
		System.out.println("after removing"+al);
		al.set(2, "book");
		
		System.out.println("after changes"+al);
		
		//copy all arraylist to another
		ArrayList<String> newal=new ArrayList<String>();
		newal.addAll(al);
		System.out.println("Copied List"+newal);
		
		System.out.println(al.contains("Copy"));
		System.out.println(al.contains("Suraj")); //it will check string value availabe or not
		System.out.println("--------------------------------");
		//converting arraylist into array
		
		String arr[]=new String[al.size()];
		
		for(int i=0; i<al.size() ; i++ )
		{
			arr[i]=al.get(i);
		}
		
		System.out.println("ArrayList"+al);
		System.out.println("Array elements are :");
		
		//for each loop
		for(String s:arr)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------");
		
		//convert array to arraylist
		
		String names[]= {"Mango","Apple","Banana"};
		ArrayList<String> alist=new ArrayList<String>(Arrays.asList(names));
		alist.add("coconut");
		alist.add("water-melon");
		
		System.out.println("after Converting array to arraylist ");
		for(String str:alist)
		{
			System.out.println(str);
		}
		
		
		
		
		
	}
	
	
	

}

package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx 
{
	public static void main(String[] args)
	{
		//object using polymorphism
				List<Integer> list=new ArrayList<Integer>();
		//ArrayList<String> list2=new ArrayList<String>();
		
				list.add(34);
				list.add(56);
				list.add(34);
				list.add(45);
			//	list.add(null);
				System.out.println(list);
				System.out.println(list.size());
				list.add(77);
				list.add(99);
				System.out.println("After adding: " +list);      //1st way to print arraylist
				System.out.println("size after adding: "+list.size());	
				System.out.println("--------------------------------");
				
				//use for loop
				System.out.println("Arraylist using for loop"); //2nd way
				for(int i=0; i<list.size(); i++)
				{
					System.out.println(list.get(i));
				}
				System.out.println("--------------------------------");
				
				//use for each loop iterate arraylist
				System.out.println(" for each  loop iterate arraylist"); //3rd way
				for(Integer in:list)
				{
					System.out.println(in);
				}
				
				System.out.println("--------------------------------");
				//use while loop iterate arraylist
				System.out.println(" while  loop iterate arraylist"); //4rd way
				int count=0;
				while(count<list.size())   //while(list.size()>count)
				{
					System.out.println(list.get(count));
					count++;
				}
				

				System.out.println("--------------------------------");
				//use Iterator Interface iterate Arraylist
				System.out.println(" Iterator using for iterate arraylist"); //5th way
				Iterator itr=list.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
		//sorting arraylist in ascending order
				
				Collections.sort(list);
				System.out.println("After Sorting in ascending the value are: ");
				System.out.println(list);
				
				
				//sorting in descending order
				Collections.sort(list,Collections.reverseOrder());
				System.out.println("After Sorting in descending the value are: ");
				System.out.println(list);
				System.out.println("--------------------------------");
				
				//adding at pacific position
				list.add(2, 1000);
				System.out.println("after changes"+list);
				
				//remove
				list.remove(2);
				System.out.println("after removing"+list);
				
				//copy all arraylist to another
				ArrayList<Integer> des=new ArrayList<Integer>();
				des.addAll(list);
				System.out.println("Copied List"+des);
				System.out.println("--------------------------------");
				
				//storing the sublist
				List<Integer> sublist1=list.subList(2, 4);
				System.out.println(sublist1);
				
				//another way
				ArrayList<Integer> sublist2=new ArrayList<Integer>(list.subList(2, 3));
				System.out.println(sublist2);
				System.out.println("--------------------------------");
				
				//search Element
				//checking contains-if data available it will give true
				System.out.println(list.contains(34));
				
				//list.clear();
				System.out.println(list);
				
				System.out.println("--------------------------------");
				//converting arraylist into array
				int arr[]=new int[list.size()];
				
				for(int i=0; i<list.size() ; i++ )
				{
					arr[i]=list.get(i);
				}
				
				System.out.println("ArrayList"+list);
				System.out.println("Array elements are :");
				
				//for each loop
				for(int s:arr)
				{
					System.out.println(s);
				}
				System.out.println("--------------------------------");
				
				//convert Array to arrayList
				
				
				
				
	}
}

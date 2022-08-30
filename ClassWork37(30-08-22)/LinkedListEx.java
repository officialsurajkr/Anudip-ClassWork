package collectionframework;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		//Polymorphic object
		LinkedList<String> names=new LinkedList<String>();
		
		//List<String>  names=new LinkedList<String>();
		
		names.add("Suraj");
		names.add("Islam");
		names.add("Ritesh");
		names.add("Sagar");
		names.add("Sunny");
		
		System.out.println(names);
		System.out.println("=================================");
		
		//using for Each Loop
		System.out.println("Using for-each Loop");
		for(String s: names)
		  {
			System.out.println(s);
		  }
		System.out.println("=================================");
		
		//using while loop
		System.out.println("Using while loop");
		int count=0;
		while(count<names.size())
		 {
			System.out.println(names.get(count));
			count++;
		 }
		System.out.println("=================================");
          
		//using Iterator
		System.out.println("using iterator");
		Iterator itr=names.iterator();
		while(itr.hasNext())
		 {
			System.out.println(itr.next());
		 }
		System.out.println("=================================");
		
		//adding elements
		names.addFirst("first");
        names.addLast("last");
        names.add(2,"chandan");
        System.out.println("After Adding"+names);
        
        //remove operations
        names.removeLast();
        names.removeFirst();
        names.remove(1);
        names.remove("Sunny");
        System.out.println("After removing :"+names);
        //names.clear();
        //System.out.println(names);
        System.out.println("=================================");
        
        //Using ListIterator
        ListIterator listit=names.listIterator();
        System.out.println("Forward direction");
        while(listit.hasNext())
        {
        	System.out.println(listit.next());
        }
        
        
        System.out.println("backward direction");
        while(listit.hasPrevious())
        {
        	System.out.println(listit.previous());
        }
        System.out.println("=================================");
        
        
        //iterate a linkedlist in reverse order
        //returns an iterator over the elements in the Deque in
        //reverese sequential order. the elements will be returned in
        // order fromlast (tail) to first (head).
        Iterator it =names.descendingIterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        System.out.println("=================================");
        
        //contains method
        
        if(names.contains("Sunny"))
        {
        	System.out.println("data present");
        }
        else
        {
        	System.out.println("data not Pressent");
     }
        System.out.println("=================================");
        //indexOf
        
        names.add("Mohan");
        System.out.println(names);
        System.out.println("last index of Mohan "+names.lastIndexOf("Mohan"));
        System.out.println("=================================");
        
        //push-insert element at the front of list
        names.push("Sachin");
        names.push("sumit");
        System.out.println("After Push :"+names);
        
        //pop-remove and return the element of the list
        System.out.println("Element Popped "+names.pop());
        System.out.println(names);
        
        //pollLast()-retrieves and remove the First element of the list,return null if list is empty
        System.out.println("First Element popped "+names.pollFirst());
        System.out.println(names);
        
        
        //pollLast()-retrieves and remove the Last element of the list,return null if list is empty
        System.out.println(" Last Element popped "+names.pollLast());
        System.out.println(names);
        System.out.println("=================================");
        
        //Convert LinkedList into ArrayList
        
        List<String> list=new ArrayList<String>(names);
        System.out.println("Converting linkedlist to array list");
        for(String s: list)
        {
        	System.out.println(s);
        }
         
        //converting linkedList to array
        String array[]= names.toArray(new String[names.size()]);
        System.out.println("converting linkedlist to array");
        for(int i=0; i<array.length;i++)
        {
        	System.out.println(array[i]);
        }
        
        
        
	}


}
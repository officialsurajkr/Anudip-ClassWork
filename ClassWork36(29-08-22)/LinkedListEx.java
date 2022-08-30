package collectionframework;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		//polymorphic object
		LinkedList<String> names=new LinkedList<String>();
		
		//List<Integer>  names=new LinkedList<Integer>();
		
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
	}


}

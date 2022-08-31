package collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class HashSetDemo
{
	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		
		System.out.println();
		hset.add("apple");
		hset.add("orange");
		hset.add("kiwi");
		hset.add("banana");
		hset.add("orange");
		//hset.add(null);
		
		System.out.println(hset);
		hset.add("water melon");
		Iterator it=hset.iterator();
		
		
		while(it.hasNext())
		 {
			System.out.println(it.next());
		 }
		System.out.println("=============================================");
		//convert hashSet into Array
		
		System.out.println("Converting HashSet into Array ");
		String array[]=new String[hset.size()];
		hset.toArray(array);
		
		//print array
		for(String s: array)
		{
			System.out.println(s);
		}
		System.out.println("=============================================");
		
		
		//convert Hashset into arrayList
		System.out.println("Converting Hashset in Arraylist");
		ArrayList<String> alist=new ArrayList<String>(hset);
		System.out.println(alist);
		System.out.println("============================================");
		
		//sorting
		//Print Elements in Assending order using TreeSet
		System.out.println("converting HashSet into TreeSet");
		TreeSet<String> tset=new TreeSet<String>(hset);
		System.out.println(tset);
		System.out.println("============================================");
		
		
		
		//LinkedHashSet
		
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
					lset.add(23);
					lset.add(53);
					lset.add(33);
					lset.add(44);
					System.out.println(lset);
		
		
		
		

	}
}

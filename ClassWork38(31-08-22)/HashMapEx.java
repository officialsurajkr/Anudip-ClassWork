package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hmap=new HashMap<Integer,String>();
		
		hmap.put(102, "Java");
		hmap.put(101, "Python");
		hmap.put(105, "Html");
		hmap.put(103, "C++");
		hmap.put(104, "Css");
		
		System.out.println(hmap);
		
//		Set set=hmap.entrySet();
//		Iterator itr=hmap.entrySet().iterator();
			//OR
		
		Iterator itr=hmap.entrySet().iterator();
		
		//Map.Entry interface provides certain method to access the entry in the
		//Map.by gainig access to the entry of the map we can easily manipulate
		//them. Map.Entry is generic and defined in java.util package
		
		while(itr.hasNext())
		{
			Map.Entry mentry=(Map.Entry)itr.next();
			
			System.out.println("Key: "+mentry.getKey());
			System.out.println("Value: "+mentry.getValue());
		}
		System.out.println("==============================================");
		
		//get value based on key
		String val = hmap.get(101);
		System.out.println("Value mapped with key: "+val);
		
		//remove value based on key
		hmap.remove(105);
		System.out.println("after removing 105 "+ hmap);
		System.out.println("==============================================");
		
		//using for each loop
		System.out.println("Using for-each loop");
		for(Map.Entry me:hmap.entrySet())
		{
			System.out.println(me.getKey()+"       "+me.getValue());
			
		}
		System.out.println("==============================================");
		
		//sorting HashMap based on key
		
		Map<Integer, String> tmap=new TreeMap<Integer,String>(hmap);
		System.out.println("after sorted the elements are");
		for(Map.Entry me: tmap.entrySet())
		{
			System.out.println(me.getKey()+"    "+me.getValue());
		}
		System.out.println("==============================================");
		
		System.out.println("size of hashMap: "+hmap.size()); //check size
		System.out.println("Key Present: "+hmap.containsKey(105)); //check key existence
		System.out.println("Value Present: "+hmap.containsValue("Java"));//check vale existence
		System.out.println("==============================================");
	
			//LinkedHashMap
		
		System.out.println("Understanding LinkedHashMap");
		
		
		LinkedHashMap<String, String> lmap=new LinkedHashMap<String, String>();
			lmap.put("f1", "apple");
			lmap.put("f2", "banana");
			lmap.put("f3", "mango");
			lmap.put("f4", "coconut");
			
			System.out.println(lmap);
			
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

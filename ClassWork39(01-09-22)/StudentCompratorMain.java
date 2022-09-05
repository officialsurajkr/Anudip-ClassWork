package collectionWithObjectClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentCompratorMain
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list=new ArrayList<Student>();
		
		list.add(new Student(101, "Suraj ", 18, 987272617));
		list.add(new Student(102, "Aman", 10, 23332617));
		list.add(new Student(103, "Islam", 24, 076272617));
		list.add(new Student(104, "Ritesh", 21, 12345321));
		list.add(new Student(105, "suraj", 25, 987272000));
		
		
		System.out.println("Sorting by Names");
		Collections.sort(list, new NameComparator());
		
		//print names
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
		Student s	=(Student)itr.next();
		System.out.println(s.getId()+"   "+s.getName()+"   "+s.getAge()+"   "+s.getPhno());
		}
		
		//sorting by Id
				System.out.println("Sorting by Id");
				Collections.sort(list, new IdComparator());
				
				//print names
				Iterator itr1=list.iterator();
				while(itr1.hasNext())
				{
				Student s	=(Student)itr1.next();
				System.out.println(s.getId()+"   "+s.getName()+"   "+s.getAge()+"   "+s.getPhno());
				}
		
		
		//sorting by age
		System.out.println("Sorting by Age");
		Collections.sort(list, new AgeComparator());
		
		//print names
		Iterator itr2=list.iterator();
		while(itr2.hasNext())
		{
		Student s	=(Student)itr2.next();
		System.out.println(s.getId()+"   "+s.getName()+"   "+s.getAge()+"   "+s.getPhno());
		}
	}

}

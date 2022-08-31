package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeHashMap 
{
	public static void main(String[] args) 
	{
		Map<Integer, Employee> empmap=new HashMap<Integer , Employee>();
		
		//creating employee objects
			Employee emp1=new Employee(101, "Randhir");
			Employee emp2=new Employee(102, "Subhojit");
			Employee emp3=new Employee(103, "Riya");
			Employee emp4=new Employee(104, "Soumen");
			
			
			//storing employee info in hashMap
			
			empmap.put(emp1.getEmpId(), emp1);
			empmap.put(emp2.getEmpId(), emp2);
			empmap.put(emp3.getEmpId(), emp3);
			empmap.put(emp4.getEmpId(), emp4);
			
			//2nd way to reduce boiler plate code
		//	empmap.put(1, new Employee(101, "Randhir"));
			empmap.put(5, new Employee(105, "suraj"));
			
			
			//printing employee info
			
			Set<Map.Entry<Integer, Employee>> employees=empmap.entrySet();
			
			for(Map.Entry em: employees)
			{
				Employee emp=(Employee) em.getValue();
				emp.display();
			}
			System.out.println("========================================");
			
			
			
			//using Iterator
			System.out.println("using Iterator");
			Iterator itr =empmap.keySet().iterator();
			while(itr.hasNext())
			{
				Employee employee=empmap.get(itr.next());
				 employee.display();
			}
			
		
	}
}

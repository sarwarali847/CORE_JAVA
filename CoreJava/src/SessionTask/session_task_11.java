/*11. Map Interface

Create a Map collection of 10 employees (eid,ename,esal).
 Consider empid as key and empObj as a value for the key. 
	11.1 First Display these collection in sorted order. 
	11.2 Remove employees having salary < 15000 from this collection.
	11.3 Add remaining employees into new map collection.
	11.4 Fetch all these new employees on console the way it inserted in 11.3 step
	 */

package SessionTask;

import java.util.*;
import java.util.Map.Entry;

public class session_task_11 {

	public static void main(String[] args) {
    Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
	emp.put(10, new Employee(121, "Rahul", 78000));
	emp.put(1,new Employee(457, "John", 25000));
	emp.put(9,new Employee(100, "Alex", 75000));
	emp.put(19,new Employee(104, "Tony", 89000));
	emp.put(4,new Employee(221, "Conor", 45000));
	emp.put(6,new Employee(360, "Virat", 68000));
	emp.put(9,new Employee(348, "Rohit", 15000));
	emp.put(5,new Employee(909, "Rajat", 58000));
	emp.put(9,new Employee(433, "Raman", 10000));
	emp.put(6,new Employee(897, "Tewatia",71000));
	
	System.out.println("Before Sorting");
	emp.forEach((k,v)->System.out.println(k+" "+v.show()));
	
	System.out.println("After Sorting");
	Map<Integer, Employee> sortedemp=new TreeMap<Integer, Employee>();
	sortedemp.forEach((k,v)->System.out.println(k+" "+v.show()));
	
	Iterator<Map.Entry<Integer, Employee>> itr=sortedemp.entrySet().iterator();
	
	Map<Integer, Employee> newMap=new TreeMap<Integer, Employee>();
	System.out.println("All employees having salary more than 15000.");
	while(itr.hasNext())
	{
		Map.Entry<Integer, Employee> item=itr.next();
		if(item.getValue().esal>15000)
			itr.remove();
		else
		{
			newMap.put(item.getKey(), item.getValue());
			System.out.println(item.getValue().show());
		}
	}
	
	

	}

}
class Employee{
	int eid;
	String ename;
	double esal;
	Employee(int eid, String ename, double esal) {
		//super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	
	
	
	

	public String show() {
		
		return "Employe Id:"+eid+" , Name:"+ename+" , Salary:"+esal;
	}
}
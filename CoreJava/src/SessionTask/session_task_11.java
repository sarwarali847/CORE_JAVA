/*11. Map Interface
Create a Map collection of 10 employees (eid,ename,esal).
 Consider empid as key and empObj as a value for the key. 
	11.1 First Display these collection in sorted order. 
	11.2 Remove employees having salary < 15000 from this collection.
	11.3 Add remaining employees into new map collection.
	11.4 Fetch all these new employees on console the way it inserted in 11.3 step
	 */

package SessionTask;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class session_task_11 {

	public static void main(String[] args) {
	Employee emp1=new Employee(121, "Rahul", 78000);
	Employee emp2=new Employee(457, "John", 25000);
	Employee emp3=new Employee(100, "Alex", 75000);
	Employee emp4=new Employee(104, "Tony", 89000);
	Employee emp5=new Employee(221, "Conor", 45000);
	Employee emp6=new Employee(360, "Virat", 68000);
	Employee emp7=new Employee(348, "Rohit", 15000);
	Employee emp8=new Employee(909, "Rajat", 58000);
	Employee emp9=new Employee(433, "Raman", 10000);
	Employee emp10=new Employee(897, "Tewatia",71000);
	
	HashMap<String, Employee> map=new HashMap<String, Employee>();
	map.put(emp1.getEid(), emp1);
	map.put(emp2.getEid(), emp2);
	map.put(emp3.getEid(), emp3);
	map.put(emp4.getEid(), emp4);
	map.put(emp5.getEid(), emp5);
	map.put(emp6.getEid(), emp6);
	map.put(emp7.getEid(), emp7);
	map.put(emp8.getEid(), emp8);
	map.put(emp9.getEid(), emp9);
	map.put(emp10.getEid(), emp10);
	
   Iterable<Employee> itr=map.values();
	   System.out.println(itr);
  	
	
	

	}

}
class Employee{
	private String eid;
	private String ename;
	private double esal;
	public Employee(String eid, String ename, double esal) {
		//super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	
	
	
	public Employee(int i, String ename2, double esal2) {
		// TODO Auto-generated constructor stub
	}



	public String getEid() {
		return eid;
	}



	public void setEid(String eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public double getEsal() {
		return esal;
	}



	public void setEsal(double esal) {
		this.esal = esal;
	}

   @Override
     public boolean equals(Object o) {
	
	   
	 return super.equals(o);
}

	@Override
	public String toString() {
		
		return "Employe Id:"+eid+" , Name:"+ename+" , Salary:"+esal;
	}
}
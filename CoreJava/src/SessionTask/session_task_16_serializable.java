/*16. Serialization and Deserialization

Create 5 objects of emp(eid,ename,esal,dno) and store them into a file called emp.db
Read them back and display employees from dept 10.
Display employees having max salary from this file.*/

package SessionTask;

import java.io.Serializable;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

public class session_task_16_serializable implements Serializable, Comparable<session_task_16_serializable>{
	
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;
	private int d_no;
	
	
	public session_task_16_serializable(int id, String name, double salary, int d_no) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d_no = d_no;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getD_no() {
		return d_no;
	}


	public void setD_no(int d_no) {
		this.d_no = d_no;
	}
	
	
	
	
	@Override
	public String toString() {
		
		return "Id:"+id+", Name:"+name+", Salary:"+salary+", Department no:"+d_no;
	}


	@Override
	public int compareTo(session_task_16_serializable o) {
		
		return (int) (this.salary-o.salary);
	}
	

	
}


/* 4.5 Write a program to give the example for ‘super’ keyword.*/

package Lab_Unit_4;

public class Lab_4_5 {

	public static void main(String[] args) {
		dept obj=new dept(53, "Sarwar", 30000, 764);
		dept obj1=new dept(32, "Shaikh", 50000, 874);
		obj.show();
		obj1.show();
		
		
	}

}

class emp{
	int id;
	String name;
	double salary;
	public emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	
	}
	
}


class dept extends emp{
	int dept_no;

	public dept(int id, String name, double salary, int dept_no) {
		super(id, name, salary);
		this.dept_no = dept_no;
	}

	

public void show()
{
	System.out.println(id+", "+name+", "+salary+", "+dept_no);
}
}

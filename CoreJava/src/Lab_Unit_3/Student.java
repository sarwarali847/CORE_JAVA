package Lab_Unit_3;

public class Student {
	 
	int id;
	String name;
	
	public Student setvalues() {
		id=324;
		name="Sarwar";
		this.name=name;
		this.id=id;
		return this;
	}
	
	public void display() {
		System.out.println("ID:"+id+" , Name:"+name);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setvalues();
		obj.display();

	}

}

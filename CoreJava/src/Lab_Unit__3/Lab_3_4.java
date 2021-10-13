/*3.4 Write a program to give the example for ‘this’ operator. And also use the
‘this’ keyword as return statement*/

package Lab_Unit__3;

public class Lab_3_4 {
	
	int id;
	String name;
	
	
	public Lab_3_4(){
		id=0;
		name="Unknown";
	}


	public Lab_3_4(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void showdata(){
		System.out.println("Id:"+id+", Name:"+name);
	}
	

}

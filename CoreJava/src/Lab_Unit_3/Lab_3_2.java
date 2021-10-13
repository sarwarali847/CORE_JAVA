/*3.2 Write a program create a class ‘simpleobject‘. Using constructor display
the message.*/

package Lab_Unit_3;

public class Lab_3_2 {
	
	int age;
	String name;
	int weight;
	int id;
	String company;
	
	
	
	public Lab_3_2(int age, String name, int weight, int id, String company) {
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.id = id;
		this.company = company;
	}



	public void show() {
   System.out.println("Age:"+age+", Name:"+name+", weight:"+weight+", id:"+id+", company:"+company);
	}

	
		

	

}

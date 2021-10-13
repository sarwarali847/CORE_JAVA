
/*4.3 Create class named as ‘a’ and create a sub class ‘b’. Which is extends from
class ‘a’. And use these classes in ‘inherit’ class. */

package Lab_Unit__4;

public class Lab_4_3 {

	public static void main(String[] args) {
		b B=new b();
		B.id=53;
		B.dept_no=8732;
		B.name="Sarwar Shaikh";
		B.display();
		B.show();
		

	}

}

class a{
	int id;
	int dept_no;
	void display() {
		System.out.println("ID:"+id+", Department no.:"+dept_no);
	}
}

class b extends a{
	String name;
	void show() {
		System.out.println("Name:"+name);
	}
}

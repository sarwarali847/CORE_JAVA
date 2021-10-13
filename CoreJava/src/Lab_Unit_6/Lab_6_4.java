/*4 Create an outer class with a function display, again create another 
class inside the outer class named inner with a function called display and 
call the two functions in the main class.*/
package Lab_Unit_6;
public class Lab_6_4 {

	public static void main(String[] args) {
		
		outerclass t=new outerclass();
		//t.test1();
		t.display(10);
		System.out.println("=================");
		t.test1(30);
		

	}

}

class outerclass{
	
	void display(int a) {
		System.out.println("Inside outer class");
		System.out.println("The passed value is "+a);
	}
	
	void test1(int b) {
		innerclass obj1=new innerclass();
		obj1.display2(b);
		
	}
	 
	class innerclass{
	void display2(int b) {
			System.out.println("Inside Inner Class");
			System.out.println("The passed value is "+b);
		}
		
	}
	
}

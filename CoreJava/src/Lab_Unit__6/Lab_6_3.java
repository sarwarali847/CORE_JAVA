/*Write a program to create interface named test. In this interface the
member function is square. Implement this interface in arithmetic class.
Create one new class called ToTestInt in this class use the object of arithmetic
class*/

package Lab_Unit__6;
public class Lab_6_3 {

	public static void main(String[] args) {
		
		test1 t=new arithmetic();
		
		t.square1(10,20);
		arithmetic t2=new arithmetic();
		t2.show();
		
		
			
	}

}

interface test1{
	void square1(int a, int b);
}
	

class arithmetic implements test1{

		public void square1(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("Square of "+a+" :"+(a*a));
			System.out.println("Square of "+b+" :"+(b*b));
		}
		
		public void show() {
			System.out.println("Inside arithmetic class");
		}
		
	}
	




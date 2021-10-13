/*Write a program to give example for multiple inheritance in Java.*/

package Lab_Unit__6;

public class Lab_6_2 {

	public static void main(String[] args) {
      MyClass2 obj=new MyClass2();
      obj.print();
      obj.show();
	}

}

interface showable
{
	void show();
}
interface printable{
	void print();
}

class MyClass2 implements showable,printable{

	@Override
	public void print() {
		System.out.println("Printing.........");
		
	}

	@Override
	public void show() {
		System.out.println("Showing.........");
		
	}
	
}
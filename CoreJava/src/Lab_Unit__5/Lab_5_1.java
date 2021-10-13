/*5.1 Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square each class has two member function
named draw () and erase (). Create these using polymorphism concepts. */

package Lab_Unit__5;

public class Lab_5_1 {

	public static void main(String[] args) {
		
		shape sh=new shape();
		circle c=new circle();
		square s=new square();
		triangle t=new triangle();
		sh.draw();
		sh.erase();
		c.draw();
		c.erase();
		s.draw();
		s.erase();
		t.draw();
		t.erase();
		 

	}

}

class shape{
	void draw() {
		System.out.println("Drawing shape....");
	}
	void erase() {
		System.out.println("Erasing shape....");
	}
}

class circle extends shape{
	void draw() {
		System.out.println("Drawing circle...");
	}
	void erase() {
		System.out.println("Erasing circle....");
	}
}

class triangle extends shape{
	void draw() {
		System.out.println("Drawing triangle...");
	}
	void erase() {
		System.out.println("Erasing triangle....");
	}
}

class square extends shape{
	void draw() {
		System.out.println("Drawing square...");
	}
	void erase() {
		System.out.println("Erasing square....");
	}
}

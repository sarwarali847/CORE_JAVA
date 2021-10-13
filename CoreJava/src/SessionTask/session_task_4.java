/* Inheritance and Polymorphism:
Write a program to create a class named shape. In this class we have three
sub classes Circle, Triangle and Square each class has two member function
named area () and draw (). Create these using polymorphism concepts.

area() --> Calculate the area of shape
draw () --> Drawing a shape [name] with coordinates [] */

package SessionTask;

public class session_task_4 {

	public static void main(String[] args) {
		circle c=new circle();
		c.area(2);
		c.draw(4);
		
		triangle t=new triangle();
		t.area(4,8);
		t.draw(4,8);
		
		square s=new square();
		s.area(8);
		s.draw(10);

	}

}

class shape{
	void area() {
		System.out.println("Calculating area");
	}
	void draw() {
		System.out.println("Drwaing shape");
	}
}

class circle extends shape{
     void area(int r)
	{
		System.out.println("Area of circle:"+(3.14*r*r));
	}
	void draw(int p)
	{
		System.out.println("Drwaing circle with radius:"+p);
	}
}

class triangle extends shape{
    void area(int l, int b)
	{
		System.out.println("Area of Triangle:"+(l*b));
	}
	void draw(int l, int b)
	{
		System.out.println("Drwaing Triangle with Length "+l+" Breadth "+b);
	}
}

class square extends shape{
    void area(int q)
	{
		System.out.println("Area of Square:"+(q*q));
	}
	void draw(int q)
	{
		System.out.println("Drwaing Square with coordinates "+q);
	}
}

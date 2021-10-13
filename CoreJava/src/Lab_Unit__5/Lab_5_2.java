/*5.2 Write a program to give a simple example for abstract clas*/

package Lab_Unit__5;

public class Lab_5_2 {

	public static void main(String[] args) {
	circcle c=new circcle();
	c.draw();
	squarre s=new squarre();
	s.draw();

	}

}

abstract class shappe{
	abstract void draw();
}
class circcle extends shape{
	void draw() {
		System.out.println("Drwaing circle....");
	}
	
}

class squarre extends shape{
	void draw() {
		System.out.println("Drwaing square...");
	}
}



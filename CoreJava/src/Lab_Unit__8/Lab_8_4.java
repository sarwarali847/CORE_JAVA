/*8.4 Write a program to create a package named pl, and implement this package
in ex1 class*/

package Lab_Unit__8;

public class Lab_8_4{

	public static void main(String[] args) {
		sarwar a=new sarwar();
		a.display();

	}

}

//package Lab_Unit_8;
class sarwar{
    public sarwar() {
	System.out.println("Class created!");
}
public void display() {
	System.out.println("hello");
}
}

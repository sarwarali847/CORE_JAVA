/*4.1 Write a program to demonstrate static variables, methods, and blocks*/

package Lab_Unit__4;

public class Lab_4_1 {
	static int a=3;
	static int b=6;
	static void value(int x)
	{
		System.out.println("a="+a+", b="+b+", x="+x);
	}
	
	static void display()
	{
		System.out.println("Static block is initialized!");
		b=a*3;
	}
	
	

    public static void main(String[] args) {
    	Lab_4_1 obj=new Lab_4_1();
    	value(24);
    	
 
		

	}

}

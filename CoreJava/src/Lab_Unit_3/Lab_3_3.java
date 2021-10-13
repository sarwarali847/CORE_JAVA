/*3.2 Write a program create a class ‘simpleobject‘. Using constructor display
the message.*/

package Lab_Unit_3;

public class Lab_3_3 {
	
	int a=10;
	
	public int change(int n) {
		a=n+10;
		return a;
	}
	public int square(int m) {
		return m*m;
	}

	public static void main(String[] args) {
		System.out.println("CALL BY VALUE EXAMPLE:");
		Lab_3_3 obj=new Lab_3_3();
		System.out.println("Initial value:"+obj.a);
		obj.change(100);
		System.out.println("Changed Value:"+obj.a);
		
		Lab_3_3 obj2=new Lab_3_3();
		int p=9;
		int s=obj2.square(p);
		System.out.println("Square value of "+p+" is:"+s);
		

	}

}

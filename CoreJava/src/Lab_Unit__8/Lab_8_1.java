/*8.1 Create class point with following instance variable and methods.
Instance variable: private int x,y
Constructors: public Point(), Point(int x, int y)
Methods: public void setX(int x), setY(int y), setXY(int x,int y*/

package Lab_Unit__8;
import java.util.*;

public class Lab_8_1 {

	public static void main(String[] args) {
		point obj1=new point(1,2);
		obj1.addXY(2,6);
		obj1.distance(obj1);
		
		obj1.setXY(10, 20);
		System.out.println("x:"+obj1.getX()+", y:"+obj1.getY());
		obj1.setX(50);
		

	}

}

class point{
	private int x,y;
	public point() { }
	public void distance(Object addXY) {
		// TODO Auto-generated method stub
		
	}
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setXY (int x, int y) 
	{ 
	 this.x = x; 
	 this.y = y; 
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void addXY(int x,int y) 
	{ 
	 System.out.println(x + y); 
	} 
	
	public void display( ) 
	{ 
	 System.out.println (x); 
	 System.out.println (y); 
	} 
	
	public void distance (point p2) 
	{ 
	 System.out.println((Math.sqrt((x-p2.x)* (x-p2.x) + (y-p2.y) * (y-p2.y))));
	}
	
	
}


/*8.3 Write a program to create a package named mypack and import it in circle
class */


package Lab_Unit__8;	
public class Lab_8_3 {
	
	public static void main(String[] args) {
		Circle c=new Circle();
		c.r=3.12;
		c.area();
		
		
	}
	
}

	

class Circle 
{ 
 double r; 
 void area() 
 { 
 System.out.println("Area of the circle = " + (3.14 * r * r)); 
 } 
} 
class Square 
{ 
 double s; 
 void area() 
 { 
 System.out.println("Area of the Square = " + (s * s)); 
 } 
} 
class Rectangle 
{ 
 double l,b; 
 void area() 
 { 
 System.out.println("Area of the circle = " + (l * b)); 
 } 
}

/*2.1 Write a program to give the examples of operators.
2.1.1 Increment and decrement operators.
2.1.2 Bitwise Complement Operator.
2.1.3 Arithmetic operator.
2.1.4 Relational Operator
2.1.5 Bitwise operator.
2.1.6 Conditional Operator
*/
package Lab_Unit_2;
import java.util.*;

public class LAB_2_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=10;
		b=13;
		System.out.println("Increment & Decrement Operator:");
		System.out.println("Original value:"+a+"\n"+"Incremented value: "+(++a));
		System.out.println("Original value:"+b+"\n"+"Decremented value: "+(--b));
		System.out.println("==========");
		
		//Bitwise complement operator
		System.out.println("Bitwise Complement Operator:");
		int res=~a;
		System.out.println("Complement of "+a+" is:"+res);
		System.out.println("==========");
		
		//Arithmetic operator
		System.out.println("Arithmatic operator:");
		System.out.println("a+b:"+(a+b)+"\n"+"a-b:"+(a-b)+"\n"+"a*b:"+(a*b)+"\n"+"a/b:"+(a/b)+"\n"+"a%b:"+(a%b));
		System.out.println("==========");
		//Relational Operator
		System.out.println("Relational Operator:");
		System.out.println("a="+a+" b="+b);
		 System.out.println("== operator:"+(a == b));  // false
		    System.out.println("! operator:"+(a != b));  // true
		    System.out.println("> operator:"+(a > b));  // false
		    System.out.println("< operator:"+(a < b));  // true
		    System.out.println(">= operator:"+(a >= b));  // false
		    System.out.println("<= operator:"+(a <= b));  // true
		    System.out.println("==========");
		    //Bitwise operator
		    System.out.println("Bitwise Operator:");
			System.out.println("a="+a+" b="+b);
			 System.out.println("& AND operator:"+(a & b));  
			    System.out.println("^ OR operator:"+(a ^ b));  
			    System.out.println(">> Right Shift operator:"+(a >> 4));  
			    System.out.println("~ Complement operator:"+(~b));  
			    System.out.println(">= operator:"+(a >= b));  
			    System.out.println("<= operator:"+(a <= b)); 
			    System.out.println("==========");
			    
			    //Conditional operator
			    System.out.println("Conditional Operator:");
				System.out.println("a="+a+" b="+b);
				
				 System.out.print("a>b&&B<=c||a!=b: "); 
				 System.out.print(a>b&&b<=a||a!=b);
				    System.out.println("\n"+"Ternary Right Shift operator:"+((a>b)?a:b));  
				    System.out.println("==========");
				    
				   
			    
			 
		    
	}

}

/*7.3 Write a program to find the solution for the following problems using
Recursion*/

package Lab_Unit_7;

public class Lab_7_3_1 {
	long fibo (int n) 
	 { 
	 if (n <= 1) return 1; 
	 else 
	 return (fibo(n-1) + fibo(n-2)); 
}

	public static void main(String[] args) {
		Lab_7_3_1 f; 
		 long l; 
		 f=new Lab_7_3_1(); 
		 l=f.fibo (5); 
		 System.out.println ("5th Fibonacci number is : "+l); 
		 
		 } 

	}


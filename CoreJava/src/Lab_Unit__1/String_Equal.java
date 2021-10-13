
/*1.2 Write a Java program to display default value of all primitive data types of
Java. */

package Lab_Unit__1;
import java.util.*;

public class String_Equal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		System.out.print("Enter String1: ");
		s1=sc.nextLine();
		System.out.print("Enter String2: ");
		s2=sc.nextLine();
		int flag;
		if(s1.equals(s2))
			System.out.println("String1 and String2 are EQUAL");
		else
			System.out.println("String1 and String2 are not NOT EQUAL");
		
		

	}

}

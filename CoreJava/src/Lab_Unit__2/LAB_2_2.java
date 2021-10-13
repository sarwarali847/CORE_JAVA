/*2.2 Write a program to give the example of control statements.
2.2.1 If statements.
2.2.2 Switch Statements.
2.2.3 For loop.
2.2.4 While Statements.
2.2.5 Do statements
 */

package Lab_Unit__2;
import java.util.*;

public class LAB_2_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,y;
		a=12;
		b=8;
		c=15;
		y=2020;
		System.out.println("IF STATEMENTS:");
		{
		if(a>b && a>c)
			System.out.println("a is greater");
		else if(b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
		}
		{
		if(y%100==0)
		{
			if(y%400==0)
				System.out.println("Leap Year:"+y);
		}
		else if(y%4==0)
			System.out.println("Leap Year:"+y);
		else
			System.out.println("Not a leap year:"+y);
		}
		System.out.println("======================");
		
		System.out.println("Switch Statements:");
		int d=5;
		switch(d)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Please enter value between 1-7");
			break;
		}
		
        System.out.println("======================");
		System.out.println("For loop:");
        System.out.println("======================");
		int n=100;
		System.out.println("Even number between 0-100:");
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
				System.out.print(i+", ");
		}
        System.out.println("======================");
        System.out.println("While loop:");
		int q=1;
		  System.out.println("======================");
	    System.out.println("Odd NUmber Between 1-100:");
		while(q!=100)
		{
			if(q%2!=0)
				System.out.print(q+", ");
			q++;
		}
       System.out.println("======================");
       System.out.println("======================");
		
        System.out.println("Do While loop:");
        int e=1;
        do {
        	System.out.print(e+", ");
        	e++;
        	
           }while(e<=10);
	}

}

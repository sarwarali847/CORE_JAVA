/*2.6. Write a program to the find the following
2.6.1 Prime number checking
2.6.2 Sum of digit*/

package Lab_Unit_2;
import java.util.*;

public class Lab_2_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,i,j,sum,rem,flag;
		flag=0;
		sum=0;
		System.out.print("Enter Number:");
		a=sc.nextInt();
		if(a==0 || a==1)
			System.out.println("Not a prime number");
		else 
		{
			for(i=2;i<=a/2;i++)
				{
				if(a%i==0)
				{
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
				}
			if(flag==0)
				System.out.println("Prime Number");
			
			}
		
		 //Reverse of number
		int temp=a;
		while(a!=0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		System.out.println("Sum of digit:"+sum);

	}

}

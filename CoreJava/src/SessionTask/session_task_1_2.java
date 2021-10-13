/*Program1 --> ask user to enter an int value and 
 check whether its a palindrome */

package SessionTask;
import java.util.*;

public class session_task_1_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number:");
		n=sc.nextInt();
		int rem,sum,temp1,temp2;
		temp1=n;
		temp2=n;
		sum=0;
		while(temp1!=0)
		{
			rem=temp1%10;
			sum=sum*10+rem;
			temp1/=10;
		}
		
		if(sum==temp2)
		System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");

	}

}

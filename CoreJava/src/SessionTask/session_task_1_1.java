/*Program2 --> ask user to enter a value for no. of rows (ex. 4) and 
display following*/
package SessionTask;
import java.util.*;

public class session_task_1_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,c=1;
		System.out.print("Enter row size:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
	
		for(int k=1;k<=i;k++,c++)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		}

	}

}

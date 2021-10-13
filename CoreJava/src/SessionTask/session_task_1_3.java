/*Ask user to enter 5 elements in an array. Swap max element to min element and vice 
versa and Display this modified array.*/

package SessionTask;
import java.util.*;

public class session_task_1_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int temp,min,max,indexofmin=0,indexofmax=0;
		System.out.print("Enter array value:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		min=arr[0];
		max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
				indexofmax=i;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==min)
				continue;
			
			if(arr[i]<min)
			{
				min=arr[i];
				indexofmin=i;
			}
		}
		temp=min;
		min=max;
		max=temp;
		System.out.print("Swapped value:");
		for(int i=0;i<arr.length;i++)
		{
		arr[indexofmax]=max;
		arr[indexofmin]=min;
		System.out.print(arr[i]+" ");
		}
		
		
	
	}

}

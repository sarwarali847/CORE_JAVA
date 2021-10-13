/*2.7 Write a program to arrange the numbers in ascending order*/

package Lab_Unit_2;
import java.util.*;

public class Lab_2_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s,i,j,temp;
		System.out.println("Enter array size:");
		s=sc.nextInt();
		int[] arr=new int[s];
		System.out.println("Enter array value:");
		for(i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
	    for (i = 0; i < arr.length; i++) {     
            for (j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;  
               }
            }
	    }
	    System.out.println("Array in ascending order:");
	    for(i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
		
       
	}

}

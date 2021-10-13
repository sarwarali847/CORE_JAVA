
/*2.5 Write a program to print the following triangle of binary digits.
2.5.1  1                          2.5.2   5
       1 0 1                              4 5
       1 0 0 0 1                          3 4 5
       1 0 0 0 0 0 1                      2 3 4 5
       1 0 0 0 0 0 0 0 1                  1 2 3 4 5
    
2.5.3 1
      1 2
      1 2 3
      1 2 3 4
      1 2 3 4 5
*/


package Lab_Unit_2;
import java.util.*;

public class Lab_2_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,rows;
		System.out.println("Enter no. of rows:");
		rows=sc.nextInt();
		int count=1;
		Scanner scan=new Scanner(System.in);
		rows=5;
		for(i=1; i<=rows; i++){
		  for(j=1; j<=i; j++){
		  if(j%2==1)
		  {
		      System.out.print("1"+" ");
		  }
		  else
		  {
		      System.out.print("0"+" ");
		  }
	 }
 		  
		 System.out.println();
		 
}   
		System.out.print("========"+"\n");
		String k="";
		int n = rows; /* if necessary change the value of n* */ 
		 for (i = rows; i >= 0; i--) 
		 { 
		 k = i +" "+ k; 
		 System.out.println (k + "\n"); 
		 }
		
		
		System.out.print("========"+"\n");
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			}
   
}
}

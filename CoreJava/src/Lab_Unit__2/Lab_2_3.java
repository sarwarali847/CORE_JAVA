/* 2.3 Write a program to calculate the following
2.3.1 Find the length of array.
2.3.2 Demonstrate a one-dimensional array.
2.3.3 Demonstrate a two-dimensional array.
2.3.4 Demonstrate a multi-dimensional array*/

package Lab_Unit__2;
import java.util.*;

public class Lab_2_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//One dimensional array
		int[] array=new int[5];
		int i,len;
		len=array.length;
		System.out.println("Array Length:"+len);
		System.out.print("Enter array value:");
		for(i=0;i<len;i++) {
			
			array[i]=sc.nextInt();
		}
		for(int z:array) {
			System.out.print(z+", ");
		}
		
		System.out.print("\n"+"===========");
		//Two dimensional array
		int[][] array2=new int[2][2];
		int k,j;
		System.out.println("\n"+"Enter array value:");
		for(k=0;k<2;k++)
		{
			for(j=0;j<2;j++)
			{
				array2[k][j]=sc.nextInt();
			}
		}
		for(k=0;k<2;k++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(array2[k][j]+" ");
				if(j==1)
					System.out.print("\n");
				
				
			}
		}
		System.out.println("===========");
		
		//Multidimensional array
		int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		  
        for (int i2 = 0; i2 < 2; i2++)
            for (int j2 = 0; j2 < 2; j2++)
                for (int z = 0; z < 2; z++)
                    System.out.println("arr[" + i2+ "]"
                    		+ "["+ j2 + "]["+ z + "] = "
                            + arr[i2][j2][z]);
		
		

	}

}

/* 9.3 Write a program using vector class.
*/

package Lab_Unit_9;

import java.util.Vector;

public class Lab_9_3 {

	public static void main(String[] args) {
		int n = 5;
        Vector<Integer> v = new Vector<Integer>(n);
  
        for (int i = 1; i <= n; i++)
            v.add(i);
  
        // Printing elements
        System.out.println(v);
  
        // Remove element at index 3
        v.remove(3);
  
        // Displaying the vector
        // after deletion
        System.out.println(v);
  
        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
	}

	}


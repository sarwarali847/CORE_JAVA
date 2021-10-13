/*11.3 Write a program to create a directory and check whether the directory is
created. */

package Lab_Unit__11;

import java.io.File;
import java.io.IOException;

public class Lab_11_3 {

	public static void main(String[] args) throws IOException {
		File f = new File ("Resources2/sarwar3.db"); 
		 if (f.mkdir()) 
		 System.out.println("created a directory"); 
		 else 
		 System.out.println ("unable to create a directory");

	}

}

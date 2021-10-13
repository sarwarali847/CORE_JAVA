/*11.2 Write a program to rename the given file, after renaming the file delete
the renamed file. (Accept the file name using command line arguments.)*/

package Lab_Unit_11;

import java.io.File;
import java.io.*;

public class Lab_11_2 {

	public static void main(String args[]) {
		try {
		for (int i = 0; i<args.length; i++) 
		 { 
		 File f = new File("Resources2",args[i]); 
		 File f1 = new File("Resources2/renfile.txt"); 
		 if (f.exists()) 
		 { 
		 System.out.println(f + " does exists."); 
		 System.out.println("Its size is " + f.length()+ " bytes"); 
		 f.renameTo(f1); 
		 System.out.println("Renamed file name :" + f1 + (i+1)); 
		 System.out.println("deleting the renamed file "+f1+(i+1)); 
		 System.out.println ("======================="); 
		 f.delete(); 
		 } 
		 else 
		 System.out.println(f +" does not exists"); 
		 } 
		 } 
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}

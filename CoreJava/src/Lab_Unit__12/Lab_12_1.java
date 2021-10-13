/*Write a program to create a file and write data into it using the
 *  methods
OutputStream class*/

package Lab_Unit__12;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Lab_12_1 {

	public static void main(String[] args) throws IOException {
		
	File file1=new File("Resources2/f2.txt")	;
	BufferedWriter br1=new BufferedWriter(new FileWriter(file1,true));
	
	BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter data you want to add into file");
	String name=br2.readLine();
	br2.close();

	FileWriter fw=new FileWriter(file1);
	fw.write(name);
	//br1.write(name);
	br1.newLine();
	br1.close();
	fw.close();
	
	
	
	}
		
		
	}
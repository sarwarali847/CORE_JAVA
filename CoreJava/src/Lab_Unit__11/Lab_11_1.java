/*11.1 Write a program to create a text file in the path c:\java\abc.txt and 
check
whether that file is exists. Using the command exists(), isDirectory(),
isFile(), getName() and getAbsolutePath()*/

package Lab_Unit__11;

import java.io.File;

public class Lab_11_1 {

	public static void main(String[] args) {
		File f1=new File("Resources2/myfile.txt");
		System.out.println("File Name : "+f1.getName());
		System.out.println("Is exist:"+f1.exists());
		System.out.println("Is Directory:"+f1.isDirectory());
		System.out.println("Is File:"+f1.isFile());
		System.out.println("Absolute Path:"+f1.getAbsolutePath());

	}

}

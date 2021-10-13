/* Write a code to read file if exists and write lines in to

another file if it includes "java" in it.
Display no. of lines(counter) and no. of worlds written in to 
this new file.
(Use Buffered classes)*/


package SessionTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Session_Task_14 {

	public static void main(String[] args) throws IOException {
	    Scanner sc=new Scanner(System.in);
		File file1=new File("Resources2/f2.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("How many line you want to add in file:");
		n=sc.nextInt();
		System.out.println("Enter contents Line wise:");
		String[] contents=new String[n];
		for(int i=0;i<n;i++)
		{
		contents[i]=br.readLine();
		}
		br.close();
		
		
		BufferedWriter br2=new BufferedWriter(new FileWriter(file1, true));
		for(int i=0;i<n;i++)
		{
		br2.write(contents[i]);
		br2.newLine();
		}
		br2.close();
		
		
		  FileReader fr=new FileReader(file1);
		  BufferedReader br3=new BufferedReader(new FileReader(file1)); 
		  String line;
		  String[] words=null;
		  int c1=0,c2=0;
		  while((line=br3.readLine())!=null) 
		  {
			  if(line.contains("java"))
			  {
				  c1++;
			  }
			  words=line.split(" ");
			  c2=c2+words.length;
			  
		  }
		  fr.close();
		  br3.close();
		  System.out.println("Number of lines in this file : "+c1);
		  System.out.println("Number of words in file : "+c2);
		 
}
}



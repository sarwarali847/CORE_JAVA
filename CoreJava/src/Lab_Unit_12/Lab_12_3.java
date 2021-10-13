/*Write a program to get the input from the user and store it into file.
Using Reader and Writer file*/

package Lab_Unit_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab_12_3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter five country name:");
		String[] data=new String[5];
		for(int i=0;i<5;i++)
		{
		data[i]=br.readLine();
		}
		br.close();
		
		File file=new File("Resources2/f3.txt");
		BufferedWriter br2=new BufferedWriter(new FileWriter(file,true));
		for(int i=0;i<data.length;i++)
		{
		br2.write(data[i]);
		br2.newLine();
		}
		br2.close();
		System.out.println("============================");
		
		BufferedReader br3=new BufferedReader(new FileReader(file));
		String line;
		while((line=br3.readLine())!=null)
		{
			System.out.println(line);
		}
		br3.close();

	}

}

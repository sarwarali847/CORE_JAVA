package Lab_Unit_12;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Lab_12_1_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String data;
		//data=br1.readLine();
		br1.close();
		
		OutputStream os=new FileOutputStream("Resources2/f2.txt") ;
		os.write(12);
		os.close();
		
		
		
		

	}

}

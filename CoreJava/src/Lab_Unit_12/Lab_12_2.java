/*Write a program to accept specified number of characters as input and
converts them into uppercase characters.*/

package Lab_Unit_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab_12_2 {

	public static void main(String[] args) throws IOException {
	
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 boolean a=false;
		 String value="";
		 while(a==false)
		 {
	
		System.out.println("Enter password of 6 digit with alphanumeric value:");
		value=br.readLine(); 
		a=Pattern.matches("\\w{3}\\@\\d{2}", value);
		 if(a==true) 
			 value=value.toUpperCase();
		 else
		 System.err.println("Enter in specified pattern!");
		 
	  }	
		 System.out.println(value);
		 br.close();
		 

	}

	

}

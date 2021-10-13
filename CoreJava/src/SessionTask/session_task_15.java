/*15.Accept the email id's from user and store these 
in to a file named as emails.txt.
Copy domain only from this emails.txt and write into another 
file named as domains.txt.
Pass these file names from command line only.
Ex: abcd@gmail.com ---> gmail.com has to be written in domains.txt
abcd@yahoo.com ---> yahoo.com has to be written in domains.txt
*/

package SessionTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class session_task_15 {

	public static void main(String[] args) throws IOException {
		
		  File file1=new File("Resources2/email.txt"); 
		  File file2=new File("Resources2/domain.txt"); 
		  
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			  System.out.println("Enter 5 Email's:"); 
			  String[] email=new String[5]; 
			  for(int i=0;i<email.length;i++) 
			  { 
				  email[i]=br.readLine(); 
			  } 
			  br.close();
			 
		    BufferedWriter br2=new BufferedWriter(new FileWriter(file1, true));
			
			  for(int i=0;i<email.length;i++)
			  { 
			  br2.write(email[i]); 
			  br2.newLine(); 
			  }
			  br2.close();
			 
		 
		
		  BufferedWriter br4=new BufferedWriter(new FileWriter(file2, true));
		  
		  String[] line=new String[5];
		  for(int i=0;i<email.length;i++)
		  {
		       if(Pattern.matches("@[1-20]", email[i]));
		       {
		    	   String domain = email[i].substring(email[i].indexOf("@") + 1);
		    	   br4.write(domain);
		    	   br4.newLine();
		       }
		  }
		  br4.close();
		  
		  //To read the file
		  BufferedReader br1=new BufferedReader(new FileReader(file1)); 
		  BufferedReader br3=new BufferedReader(new FileReader(file2));
		  
		  String a,b;
		  System.out.println("===============================");
		  while((a=br1.readLine())!=null)
			  System.out.println(a);
		  br1.close();
		  System.out.println("=================================");
		  while((b=br3.readLine())!=null)
			  System.out.println(b);
		  br3.close();
		  
		  
		   
		  
		 
		  		  
		   

	}

}

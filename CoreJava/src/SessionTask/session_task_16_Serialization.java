/*16. Serialization and Deserialization
Create 5 objects of emp(eid,ename,esal,dno) and store them into a file called 
emp.db
Read them back and display employees from dept 10.
Display employees having max salary from this file.*/

package SessionTask;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class session_task_16_Serialization {

	public static void main(String[] args) {
		
		List<session_task_16_serializable> employe=new ArrayList<session_task_16_serializable>();
		ObjectOutputStream oos=null;
		String outputFile="Resources2/emp.db";
		
		try {
			oos=new ObjectOutputStream(new FileOutputStream(outputFile));
			employe.add(new session_task_16_serializable(23,"Sarwar", 45000, 450));
			employe.add(new session_task_16_serializable(33,"Sahil", 55000, 10));
			employe.add(new session_task_16_serializable(65,"ahmad", 25000, 674));
			employe.add(new session_task_16_serializable(75,"Faisal", 79000, 10));
			
			for(session_task_16_serializable emp:employe)
			{
				oos.writeObject(emp);
			}
			session_task_16_serializable Max_Salary=Collections.max(employe);
			System.out.println("Max Salary Employee: "+"\n"+Max_Salary);
			System.out.println("Serialization done!!");
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		finally {
			if(oos!=null)
				try {
					oos.close();	
				}
			catch(Exception e) {
				e.getStackTrace();
			}
		}
		
		

	}

}

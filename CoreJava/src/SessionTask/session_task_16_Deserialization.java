/*16. Serialization and Deserialization
Create 5 objects of emp(eid,ename,esal,dno) and store them into a file called 
emp.db
Read them back and display employees from dept 10.
Display employees having max salary from this file.*/

package SessionTask;
import java.util.*;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class session_task_16_Deserialization {

	public static void main(String[] args) {
		
		List<session_task_16_serializable> employe=new ArrayList<session_task_16_serializable>();
		ObjectInputStream ois=null;
		
		String inputFile="Resources2/emp.db";
		//Iterator<session_task_16_serializable> itr=employe.iterator();
		try {
			ois=new ObjectInputStream(new FileInputStream(inputFile));	
			
			while(true)
			{
				session_task_16_serializable emp= (session_task_16_serializable) ois.readObject();
				
				
				
				
				
				//System.out.println("Employe having department number 10 :");
				if(emp.getSalary()>50000 && emp.getD_no()==10)
				{
				System.out.print("Id:"+emp.getId()+"\t");
				System.out.print("Name:"+emp.getName()+"\t");
				System.out.print("Salary:"+emp.getSalary()+"\t");
				System.out.print("Department no:"+emp.getD_no()+"\t");
				System.out.println();
				}
			
									
		}
			
			
	}
		catch(EOFException e)
		{
			e.getMessage();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		finally {
			if(ois!=null)
				try {
					ois.close();	
				}
			catch(Exception e) {
				e.getStackTrace();
			}
		}
		
		

	}

}

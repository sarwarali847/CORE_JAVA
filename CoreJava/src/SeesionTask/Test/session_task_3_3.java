
/*Has-A Relation:

Create a class as Employee (Attributes --> eid, ename,esal,project)
Create a class as Project (Attributes --> pid, pname,plocation)
Crate two employees and assign them a Project as "Mobile App for Project management"
create two more employees and assign them a Project as "E-Commerce Web App"

Out of these 4 display employees having salary > 25000 and working for Web application.
*/
package SeesionTask.Test;

import SessionTask.session_task_3_2;

public class session_task_3_3 {

	public static void main(String[] args) {
		
		session_task_3_2[] value= {
				       new session_task_3_2(12, "Sarwar", 70000, 
			           "AppDevelopment", 2342, "Mobile App", "Pune"),
				       new session_task_3_2(22, "Sahil", 100000, 
					    "AppDevelopment", 4244, "Mobile App", "Mumbai"),
				       new session_task_3_2(32, "Ahmad", 80000, 
					     "WebDevelopment", 7564, "Web App", "Kolkata"),
				       new session_task_3_2(42, "Saad", 90000, 
					      "WebDevelopment", 2321, "Web App", "Navi Mumbai")
		};
		
		for(session_task_3_2 a: value) {
		
			if(a.project.equals("WebDevelopment") && a.salary>60000)
			{
				System.out.println("Name:"+a.ename+", Id:"+a.eid+", Project Domain:"+a.project+", Project Name:"+a.pname);
			}
		}
		
		
		
			
		}

}

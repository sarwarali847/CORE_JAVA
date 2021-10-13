/*3.Has-A Relation:
Create a class as Employee (Attributes --> eid, ename,esal,project)
Create a class as Project (Attributes --> pid, pname,plocation)
Crate two employees and assign them a Project as "Mobile App for Project management"
create two more employees and assign them a Project as "E-Commerce Web App"

Out of these 4 display employees having salary > 25000 and working for Web application.
*/

package SessionTask;

public class session_task_3 {
	 
	public int eid;
	public String ename;
	public double salary;
	public String project;
	public session_task_3(int eid, String ename, double salary, String project) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.project = project;
	}
	

}

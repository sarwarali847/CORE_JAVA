/*3. 
Has-A Relation:
Create a class as Employee (Attributes --> eid, ename,esal,project)
Create a class as Project (Attributes --> pid, pname,plocation)
Crate two employees and assign them a Project as "Mobile App for Project management"
create two more employees and assign them a Project as "E-Commerce Web App"*/

package SessionTask;

public class session_task_3_2 extends session_task_3{
	public int pid;
	public String pname;
	public String plocation;
	public session_task_3_2(int eid, String ename, double salary, String project, int pid, String pname, String plocation) {
		super(eid, ename, salary, project);
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}
	
}

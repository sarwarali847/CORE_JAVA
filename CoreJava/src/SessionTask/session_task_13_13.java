package SessionTask;

public class session_task_13_13 {
	int id;
	String name;
	double marks;
	session_task_13 subject;
	

	public session_task_13_13(int id, String name, double marks, session_task_13 subject) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.subject = subject;
	}


	public static void main(String[] args) {
		session_task_13_13 sarwar=new session_task_13_13(12,"sarwar",98,session_task_13.C);
		session_task_13_13 sahil=new session_task_13_13(22,"sahil",78,session_task_13.JAVA);
		
		String sub="JAVA";
		session_task_13_13[] value= {sarwar, sahil};
		for(session_task_13_13 a : value)
		{
			if(a.subject.equals(session_task_13.valueOf(sub)))
			{
				System.out.println("Name:"+a.name);
			}
		}
		
          
	
	}

}

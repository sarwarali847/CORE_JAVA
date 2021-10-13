package SessionTask;

public class session_task_2_2 {

	int id;
	String name;
	String course;
	double marks;
	
	


	public session_task_2_2(int id, String name, String course, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	
	
	void show() {
		System.out.println("Id:"+id+", Name:"+name+", Course:"+course+", Marks:"+marks);
	}
	

}

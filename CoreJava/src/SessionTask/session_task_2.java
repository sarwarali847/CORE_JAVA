/*.Class, Object and Constructor
Create a class as Student Attributes --> stid, name,course,marks
param constructor to assign values Student(stid, name,course,marks)
method as show() --> Display all details

Ask user to enter 5 students details and hold these objects in an array.
Display students having more than 60 marks from BCA course.*/

package SessionTask;

public class session_task_2 {

	public static void main(String[] args) {
		session_task_2_2 obj=new session_task_2_2(23, "Sarwar", "BE", 89);
		obj.show();
		
		session_task_2_2 Hasan=new session_task_2_2(53,"hasan", "BCA",75);
		session_task_2_2 Sahil=new session_task_2_2(43,"sahil", "BCA",80);
		session_task_2_2 Ahmad=new session_task_2_2(37,"Ahmad", "MCA",65);
		session_task_2_2 Faisal=new session_task_2_2(93,"Faisal", "BCA",55);
		session_task_2_2 Saad=new session_task_2_2(63,"Saad", "BTECH",55);
		
		session_task_2_2[] names= {Hasan,Sahil,Ahmad,Faisal,Saad};
		
		for(session_task_2_2 n:names)
		{
			if(n.course=="BCA" && n.marks>60)
			{
				System.out.println("Name:"+n.name+", Id:"+n.id);
			}
				          
		}
		

	}

}

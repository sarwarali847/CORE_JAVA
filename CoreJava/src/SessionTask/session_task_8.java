/* 8. List:
Create 5 objects of Trainer (tr_id,name,course,salary) with different values.
Using Collection, filter out the trainers having salary > 20000 and course is Java.
Put these filtered trainers into another collection for further reference. 
Remove it from the original collection.
Display these filtered trainers collection objects using an iterator.*/

package SessionTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class session_task_8 {

	public static void main(String[] args) {
		List<trainer> trainers=new ArrayList<trainer>();
		trainers.add(new trainer(89, "sarwar", "CPP", 25000));
		trainers.add(new trainer(29, "fazil", "JAVA", 65000));
		trainers.add(new trainer(24, "sahil", "PHP", 45000));
		trainers.add(new trainer(98, "satya", "JAVA", 76000));
		trainers.add(new trainer(13, "pankaj", "PYTHON", 12000));
		trainers.add(new trainer(63, "ahmad", "JAVA", 20000));
		
		Iterator itr=trainers.iterator();  
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		List<trainer> newTrainers=new ArrayList<trainer>();
		
		for(trainer data:trainers)
		{
			if(data.course=="JAVA" && data.salary>20000)
			{
				newTrainers.add(data);  
				
			}
		}
		
		try {
		for(trainer data:trainers)
		{
			if(data.course=="JAVA" && data.salary>20000)
			{
				trainers.remove(data);
			}
		}
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		
		
		
		System.out.println("\n"+"================================");
		Iterator itr2=newTrainers.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		System.out.println("\n"+"================================");
		Iterator itr4=trainers.iterator();
		while(itr4.hasNext())
		{
			System.out.println(itr4.next());
		}
		

	}
}

class trainer{
	int id;
	String name;
	String course;
	double salary;
	public trainer(int id, String name, String course, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Id:"+id+", Name:"+name+", Course:"+course+", Salary:"+salary;
	}
	
}

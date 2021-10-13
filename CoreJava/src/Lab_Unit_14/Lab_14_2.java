/*
Write a program to create two threads. In this class we have one
constructor used to start the thread and run it. Check whether these two
threads are run are not 
*/

package Lab_Unit_14;

public class Lab_14_2 {

	public static void main(String[] args) throws InterruptedException {
		
		CreateThread t1=new CreateThread("one");
		CreateThread t2=new CreateThread("two");
		t1.t.setName("Thread1");
		t2.t.setName("Thread2");
		t1.t.setPriority(1);
		t2.t.setPriority(2);
		
		System.out.println("Thread1 Name : "+t1.t.getName());
		System.out.println("Thread2 Name : "+t2.t.getName());
		System.out.println("Thread1 Priority : "+t1.t.getPriority());
		System.out.println("Thread2 Priority : "+t2.t.getPriority());
		System.out.println("Thread t1 is alive : "+t1.t.isAlive());
		System.out.println("Thread t2 is alive : "+t2.t.isAlive());
		try {
			System.out.println("Waiting thread to finish..");
			t1.t.join();
			t2.t.join();	
		}
			catch(Exception e)
		{
				
		}
				System.out.println("Thread t1 is alive : "+t1.t.isAlive());
				System.out.println("Thread t2 is alive : "+t2.t.isAlive());
				System.out.println("Main thread exiting....");
		

		
	}

}
class CreateThread extends Thread{
	String tname;
	Thread t;
	
	CreateThread(String s) {
		tname=s;
		t=new Thread(this,s);
		System.out.println("New Thread : "+t);
		t.start();
	}
		
		public void run() {
			for(int i=1;i<=5;i++)
			{
				System.out.println(tname+" "+i);
				try {
					Thread.sleep(100);
				}
				catch (Exception e) {
					e.getStackTrace();
				}
		}
			System.out.println(tname+" "+"Exiting...");
		
	}
	
}

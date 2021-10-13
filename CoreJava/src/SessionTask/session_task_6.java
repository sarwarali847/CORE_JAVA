/*
6.  Multi threading
Create a class for Thread1 to execute "Java is nice" in reverse order with pause of 2 seconds. --> ecin si avaJ
Create a class Thread2 to execute "Java is nice" with alternate characters with pause of 1 second.
--> J v  i  i e

join -->  join() method which allows one thread to wait until another thread completes its execution.
t1.start(); //t1 is executing
t1.join();
t2.start();
t2.join();*/

package SessionTask;
//import java.util.*;
public class session_task_6 {

	public static void main(String[] args) throws InterruptedException{
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.run();
		t1.join();
		t2.run();
		t2.join();
		
	}

}

class thread1 extends Thread{
	public void run() {
	String s2="";
	String s="java is nice";
	for(int i=s.length()-1;i>=0;i--)
	{
		try {
			Thread.sleep(500);
		    }
		catch(Exception e)
		{
			System.out.println(e.getMessage());;
		}
		s2=s2+s.charAt(i);
	}
		System.out.println(s2);
		 
		
	}
		
	}

class thread2 extends Thread{
	public void run() {
		String s1="j a v a i s n i c e";
		for(int i=1;i<s1.length()-1;i++)
		{
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	     		System.out.print(s1.charAt(i+1)+" ");
			
			
		}
	}
}

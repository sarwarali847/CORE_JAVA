/*Write a program to create a class MyThread in this class a constructor,
call the base class constructor, using super and starts the thread. The run
method of the class starts after this. It can be observed that both main
thread and created child thread are executed concurrently.
*/

package Lab_Unit_13;

public class Lab_Unit_13_2 {

	public static void main(String[] args) throws InterruptedException {
	 a t1=new a();
	 MyThread2 t2=new MyThread2();
	 
	 
	
}
}


class a extends Thread{
	a() 
	 { 
	 super ("Using Thread class"); 
	 System.out.println ("Child thread:" + this);
	 start();
	 }
	 
	
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Running Child thread "+i);
			try {
				Thread.sleep(400);
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Exiting child thread");
	}
	
	
}

class MyThread2 extends Thread{
	MyThread2() 
	 { 
	 super ("Using MyThread2 class"); 
	 System.out.println ("Main thread:" + this);
	 start();
	 }
	
	public void run() {
     for(int i=1;i<=5;i++)
      {
	 System.out.println("Running main thread "+i);
	 try {
		 Thread.sleep(400);
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());;
	 }
	 
   }
 System.out.println("Exiting from main thread");
	
}
}


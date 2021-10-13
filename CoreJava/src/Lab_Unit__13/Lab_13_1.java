/*Write a program to illustrate creation of threads using runnable 
class.(start 
method start each of the newly created thread. Inside the run method 
there 
is sleep() for suspend the thread for 500 milliseconds).*/

package Lab_Unit__13;

public class Lab_13_1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		Thread t1=new Thread(t);
		t1.start();
		t1.stop();
		System.out.println(t1.isAlive());
		

	}

}

class MyThread implements Runnable{

	public void run() {
		for(int i=1;i<=10;i++)
		{
	     System.out.print(i+" ");
	     try {
	    	 Thread.sleep(500);
	        }
	     catch(Exception e)
	     {
	    	 System.out.println(e.getMessage());
	     }
		}
		System.out.println();
		
	}
	
}

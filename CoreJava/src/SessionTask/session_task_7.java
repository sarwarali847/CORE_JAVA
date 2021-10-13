/*Thread Synchronization:
SharedResource s = new SharedResource();

MyThread t1 = new MyThread(2,5);
MyThread t2 = new MyThread(3,7);

s.doPrint(i,j)  2,5 => 2 3 4 5 6 7  (5 digits are added in seq after 2)
                3,7 => 3 4 5 6 7 8 9 10 (7 digits are added in seq after 3)
						  
                      Print with 1 second pause
Make that doPrint method as synchronized method.*/

package SessionTask;

public class session_task_7 {

	public static void main(String[] args) throws InterruptedException {
		sharedresource obj=new sharedresource();
//		obj.doprint(2, 5+2);
//		obj.join();
//		obj.doprint(3, 7+3);
//		obj.join();
		
		
		 a A =new a();
		 A.run();
		 
		 b B=new b(); 
		 B.run();
		 

	}

}


class sharedresource{
	synchronized static void doprint(int a,int b) {
		
		for(int i=a;i<=b;i++)
		{
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
			System.out.println(e.getMessage());	
			}
		}
		System.out.println();
		
	}

	public void join() throws InterruptedException {
		Thread.sleep(500);
		
	}
}

class a extends Thread{
	public void run() {
		sharedresource.doprint(2, 5);
		
	}
}


class b extends Thread{
	public void run() {
		sharedresource.doprint(3, 7);
		
	}
}

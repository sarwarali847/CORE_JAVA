/*Create a multithreaded program by creating a subclass of Thread and then
creating, initializing, and staring two Thread objects from your class. The
threads will execute concurrently and display Java is hot, aromatic, and
invigorating to the console window*/

package Lab_Unit_15;

public class Lab_15_1 {

	public static void main(String[] args) throws InterruptedException {
             
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t1.join();
		System.out.println("t1 Is Alive : "+t1.isAlive());
		System.out.println("======================");
		t2.start();
		t2.join();
		System.out.println("t2 Is Alive : "+t2.isAlive());
		
	}

}

class MyThread extends Thread{
	String msg[]={"java is hot", "java is aromatic", "java is invigorating"};
	public void run() {
		for(int i=0;i<msg.length;i++)
		{
			System.out.println(msg[i]);
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}

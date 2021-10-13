/*Create a multithreaded program as in the previous exercise by creating the 
MyThread subclass of Thread. But create threads as objects of the class
MyClass, which is not a subclass of Thread. MyClass will implement the
runnable interface and objects of MyClass will be executed as threads by
passing them as arguments to the Thread constructor.*/

package Lab_Unit_15;

public class Lab_15_2 {

	public static void main(String[] args) throws InterruptedException {
		test t1=new test();
		test t2=new test();
		Thread t3=new Thread(t1);
		Thread t4=new Thread(t2);
		t3.start();
		t3.join();
		System.out.println("==================");
		t4.start();
		t4.join();
	

	}

}

class test implements Runnable{

	String msg2[]={"java is hot", "java is aromatic", "java is invigorating"};
	public void run() {
		for(int i=0;i<msg2.length;i++)
		{
			System.out.println(msg2[i]);
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
	
         }
}
}

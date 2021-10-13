/*Write a program to get the reference to the current thread by calling
currentThread() method*/

package Lab_Unit_14;

public class Lab_14_1{
	

	public static void main(String[] args) throws InterruptedException {
		Thread t=Thread.currentThread();
		System.out.println("Current Thread : "+t);
		System.out.println("Name of current Thread : "+t.getName());
		System.out.println("Priority : "+t.getPriority());
		t.setName("MyThread");
		System.out.println("After name change : "+t.getName());
		t.setPriority(1);
		System.out.println("After changing priority : "+t.getPriority());
		System.out.println("Number of active thread : "+t.activeCount());
		
		
	}

}


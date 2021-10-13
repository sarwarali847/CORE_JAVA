/*16.4 Write a program for interthread communication process. In this they
have three classes consumer, producer and stock.*/

package Lab_Unit__15;

public class Lab_16_4 extends Thread {
	 Lab_16_4 (String name, float seconds) 
	 { 
	 super(name);
	 start(); 
	 } 
	public void run ( ) 
	{ 
	 while (true) 
	 { 
	 System.out.println (Thread.currentThread ( ).getName ( ) ); 
	 try 
	 { 
	 Thread.sleep (1000); 
	 } 
	 catch (InterruptedException e) 
	 { 
	 return ; 
	 } 
	 
  }
}

	public static void main(String[] args) {
		new Lab_16_4 ("one potato", 1.1F); 
	    new Lab_16_4 ("one onion", 1.3F); 
		new Lab_16_4 ("two tomato", 0.5F); 
		new Lab_16_4 ("four ladyfinger", 0.7F);

	}

}

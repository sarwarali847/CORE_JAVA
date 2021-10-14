package Lab_Unit__15;

public class Lab_16_3 extends Thread {
	
	private int delay; 
	Lab_16_3 (String name, float seconds) 
	{ 
		super (name); 
		delay = (int) seconds * 1000;
		start(); 
	} 
	public void run ( ) 
	{ 
		while (true) 
		{ 
			System.out.println (Thread.currentThread ( ).getName ( ) ); 
			try 
			{ 
			 Thread.sleep (delay); 
			} 
			 catch (InterruptedException e) 
			{ 
			  return ; 
		} 
		}
	}

	public static void main(String[] args) {
		

		new Lab_16_3 ("JAVA", 1.1F); 
		new Lab_16_3 ("PYTHON", 1.3F); 
		new Lab_16_3 ("CPP", 0.5F); 
		new Lab_16_3 ("CSS", 0.7F); 

	}

}

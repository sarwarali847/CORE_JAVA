
/* 4.2 Write a program for reuse class. For this program use the above ‘room
class’ program.
*/

package Lab_Unit__4;

import java.util.*;

public class Lab_4_2 {
	
	Room r;
	void createhouse()
	{
		r=new Room();
	}
	void displaydata()
	{
		r.displaydata();
		r.createhouse();
	}
	
	

	public static void main(String[] args) {
		Lab_4_2 obj=new Lab_4_2();
		obj.createhouse();
		obj.displaydata();
		

	}

}



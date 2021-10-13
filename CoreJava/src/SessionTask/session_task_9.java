/*
9. Implement Doubly Linked List in Java. (In java there is no pointer like C/CPP)
Doubly Linked List contains a link element called first and last.
Each link carries a data field(s) and two link fields called next and prev. 
It is a linked data structure that consists of a set of sequentially linked records called nodes. 
Each node contains three fields: two link fields and one data field.
 */


package SessionTask;

import java.util.*;

public class session_task_9 {

	public static void main(String[] args) {
		
		LinkedList<Object> value=new LinkedList<Object>
		                       (Arrays.asList("SARWAR","BE",10.0,23));
		value.add("shaikh");
		value.addFirst("EXTC");
		value.add(2, "Excellent coding");
		value.remove(5);
		
	Iterator itr=value.descendingIterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
		
		
//		for(Object obj:value)
//		{
//			System.out.println(obj);
//		}

	}

}




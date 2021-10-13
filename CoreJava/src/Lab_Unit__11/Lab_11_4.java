/*11.4 Write a program to open one application using process class.*/

package Lab_Unit__11;

public class Lab_11_4 {

	public static void main(String[] args) {
		try {
		 Runtime r; 
		 r = Runtime.getRuntime(); 
		 System.out.println(r.freeMemory()); 
		 int x[] = {1}; 
		 r.gc(); 
		 System.out.println(r.freeMemory()); 
		 Process p = r.exec("pbrush.exe"); 
		 System.out.println(r.freeMemory()); 
		 }catch (Exception e) {
			e.getStackTrace();
			}

	}

}

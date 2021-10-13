/* Write a program for example of multiple catch statements occurring in a
program   */

package Lab_Unit_10;

public class Lab_10_2 {

	public static void main(String[] args) throws Exception {
       try {
		int[] arr=new int[5];
		int a=10,b=0;
		//if(b==0)
			//throw new Exception("b should not be zero");
		arr[1]=a/b;
		arr[10]=5;
		String s=null;
		System.out.println(s.length());
		
       }
       catch(ArithmeticException e) {
    	   System.out.println("Arithmetic exception occured! : "+e.getMessage());
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println("Array index out of bounds exception occured : "+e.getMessage());
       }
       catch(Exception e) {
    	   System.out.println("Parent exception occured! : "+e.getMessage());
       }
       finally{
    	   System.out.println("Done!");
       }
	}
}


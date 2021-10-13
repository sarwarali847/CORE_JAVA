
/*Write a program to illustrate usage of try/catch with finally clause*/

package Lab_Unit_10;

public class Lab_10_4 {

	public static void main(String[] args) throws Exception {
		 try {
	    	   int[] arr=new int[-4];
	           int l;
	           l=arr.length;
	           int a=10;
	           //System.out.println(arr[a]);
	    	   if(a>0)
	    	   throw new Exception("Array size must be positive!");
	    	   
	       }
	      
	       catch(NegativeArraySizeException e)
	       {
	    	   System.out.println("Something went wrong1 : "+e);
	       }
		 catch(Exception e) {
			 System.out.println("Array index error : "+e.getMessage());
		 }
	       finally
	       {
	    	System.out.println("Done!");   
	       }
	       
	   
	       

	}

}

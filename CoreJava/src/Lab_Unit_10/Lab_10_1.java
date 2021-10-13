/*1 Write a program for example of try and catch block. 
In this check
whether the given array size is negative or not.*/

package Lab_Unit_10;

public class Lab_10_1 {

	public static void main(String[] args) throws Exception {
      
       try {
    	   int[] arr=new int[-3];
           int l;
           l=arr.length;
           System.out.println(arr[1]);
    	   if(l<0)
    	   throw new Exception("Array size must be positive!");
    	   
       }
      
       catch(NegativeArraySizeException e)
       {
    	   System.out.println("Something went wrong1 : "+e);
       }
       finally
       {
    	System.out.println("Done!");   
       }
       
   
       
       
	}



	

}

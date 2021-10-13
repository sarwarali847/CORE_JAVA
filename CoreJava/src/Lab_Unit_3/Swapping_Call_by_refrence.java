package Lab_Unit_3;

public class Swapping_Call_by_refrence {
	
	public static void main(String[] args) {
	int a=30;
	int b=25;
	System.out.println("Before Swapping:"+"\n"+"a:"+a+", b:"+b);
	swapfunction(a,b);

		
}
	public static void swapfunction(int a, int b) {
		
		//swapfunction obj=new swapfunction();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping:"+"\n"+"a:"+a+", b:"+b);
	}
	
	
}

/*Write a program to illustrate sub class exception precedence over base
class.*/

package Lab_Unit_10;

import java.io.IOException;

public class Lab_10_3 {

	public static void main(String[] args){
   parent p=new child();
   p.msg();
	}

}

class parent{
	void msg() {
		System.out.println("Parent method");
	}
}

class child extends parent{
	void msg() throws ArithmeticException{
		System.out.println("Child Method");
	}
}

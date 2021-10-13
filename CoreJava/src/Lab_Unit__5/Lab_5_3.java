/* 5.3 Write a program suppose, it is required to build a project consisting of a
number of classes, possibly using a large number of programmers. It is
necessary to make sure that every class from which all other classes in the
project will be inherited. Since any new classes in the project must inherit
from the base class, programmers are not free to create a different interface. 
Therefore, it can be guaranteed that all the classes in the project will respond
to the same debugging commands*/

package Lab_Unit__5;

import Lab_Unit__5.Lab_5_3_1.x;
import Lab_Unit__5.Lab_5_3_1.y;
import Lab_Unit__5.Lab_5_3_1.z;

abstract class Lab_5_3 {

	public static void main(String[] args) {
		Lab_5_3_1 obj1=new Lab_5_3_1();
		obj1.dump();
		x obj2=obj1.new x();
		obj2.X(1,2,3);
		obj2.dump();
		
		y obj3=obj1.new y();
		obj3.Y(2,4,6);
		obj3.dump();
		
		z obj4=obj1.new z();
		obj4.Z(12,32,13);
		obj4.dump();
		
		
		
		
	  
		

	}
}


class Lab_5_3_1 {
void dump() {
	System.out.println("Debuggable error no dump() is defined for this class!");
}
private int a2,b2,c2;
public void P(int p1,int p2,int p3)
{
	a2=p1;
	b2=p2;
	c2=p3;
}


class x extends Lab_5_3_1{
	private int a,b,c;
	void X(int a1,int b1,int c1)
	{
		a=a1;
		b=b1;
		c=c1;
	}
	void dump(){
		System.out.println("a="+a+", b="+b+", c="+c);
	}
}

class y extends Lab_5_3_1{
	private int i,j,k;
	public void Y(int i1,int j1,int k1)
	{
		i=i1;
		j=j1;
		k=k1;
	}
	void dump(){
		System.out.println("i="+i+", j="+j+",k="+k);
	}
}

class z extends Lab_5_3_1{
	private int p,q,r;
	public void Z(int p1,int q1,int r1)
	{
		p=p1;
		q=q1;
		r=r1;
	}
	void dump(){
		System.out.println("p="+p+", q="+q+",r="+r);
	}
}
}


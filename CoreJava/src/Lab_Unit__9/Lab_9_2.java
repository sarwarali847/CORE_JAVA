package Lab_Unit__9;

public class Lab_9_2 {

	public static void main(String[] args) {
		box3d b=new box3d();
		box a=new box();
		a.l=12.35;
		//b.l=a.l;
		a.h=89.33;
		//b.h=a.h;
		a.w=23.23;
		//b.w=a.w;
		b.value2(a.l, a.w, a.h);
		
	}

}

class box{
	double l,w,h;
	void value(double l,double w,double h) {
		
	}
}
class box3d extends box{
	void value2(double l,double w,double h) {
		double area,volume;
		area=2*(l*w)+2*(l*h)+2*(h*w);
		volume=l*w*h;
		System.out.println("Area of box : "+area);
		System.out.println("Volume of box : "+volume);
	}
}


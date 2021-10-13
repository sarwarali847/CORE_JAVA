/*7.1 Write a class called ColourChecking. Define a color with red = 193,
 green
=255 and blue = 183. No separate the rgb values. Find the Hue, saturation
and brightness of this color.*/

package Lab_Unit_7;

public class Lab_7_1 {

	public static void main(String[] args) {
		RGB rgb=new RGB();
		rgb.HUE(129, 88, 47);
	}

}

class RGB{
	void HUE(double rr,double gg,double bb) {
		double r,g,b;
		r=rr/255;
		g=gg/255;
		b=bb/255;
		
		double cmax,cmin,diff;
		cmax=Math.max(r, Math.max(g, b));
		cmin=Math.min(r, Math.max(g, b));
		diff=cmax-cmin;
		
		double h=-1,s=-1;
		if(cmax==cmin)
			h=0;
		else if(cmax==r)
			 h = (60 * ((g-b) / diff) + 360) % 360;
		else if(cmax==g)
			 h = (60 * ((b-r) / diff) + 120) % 360;
		else if(cmax==b)
			 h = (60 * ((r-g) / diff) + 240) % 360;			 
		else if(cmax==0)
			s=0;
		else
			s=(diff/cmax)*100;
		
		double v=cmax*100;
		
		 System.out.println("(" + h + " ," + s + ", " + v + ")");
		
		
	}
}

/*7.2 Write a program to check the font class method as follows: 
Create a font
TimesRoman bold and Italic size 12. In this object use the font methods. 
Then
display the attributes of the font*/

package Lab_Unit__7;
import java.awt.Font;
import java.util.*;

public class Lab_7_2 {

	public static void main(String[] args) {
		
		 
		 Font f; 
		 f = new Font("Calibri", Font.BOLD+Font.ITALIC,12); 
		 String font = f.getName(); 
		 int style = f.getStyle(); 
		 int size = f.getSize(); 
		 boolean bold = f.isBold(); 
		 boolean normal = f.isPlain(); 
		 boolean italic = f.isItalic(); 
		System.out.println("Font : "+ font + "\nStyle : "+ style + "\nSize: "+ size + "\nBold : "+bold + "\nItalic : "+italic); 
	}

}

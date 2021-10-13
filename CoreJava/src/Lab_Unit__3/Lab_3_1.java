
/*3.1 Write a program to create a room class, the attributes of this class isroomno,
roomtype, roomarea and ACmachine. In this class the memberfunctions are
setdata and displaydata.
*/

package Lab_Unit__3;

public class Lab_3_1 {
	int roomno=20;
	String roomtype="4BHK";
    double roomarea=2000;
    String acmachine="Yes";
    
    public void setdata(){
    	roomno=95;
    	roomtype="10BHK";
    	roomarea=1000;
    	acmachine="Yes";
    	
    }
    public void displaydata() {
    	System.out.println("Room No.:"+roomno+"\n"+"Room Type"
    			+ ":"+roomtype+"\n"+"Room area:"+roomarea+"\n"+"Ac Machine:"+acmachine);
    }

	public static void main(String[] args) {
		
		Lab_3_1 object=new Lab_3_1();
		object.setdata();
		object.displaydata();
		

	}

}

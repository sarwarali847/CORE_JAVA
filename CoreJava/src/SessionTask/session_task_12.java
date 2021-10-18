/*12. Comparator
Create a collection for 5 Movies (private members ratings,name,year)
Using switch statements create a menu driven program

Enter your choice:
1. Sort by ratings
2. Sort by name
3. Sort by year
4. Sort by ratings in Reverse
5. Sort by name in Reverse
6. Sort by year in Reverse
7. EXIT*/

package SessionTask;
import java.util.*;

public class session_task_12 {
	
	public static void main(String[] args) {
	 
		ArrayList<Movies> al=new ArrayList<Movies>();
		Movies m1=new Movies(7.5f,"Dangal",2018);
		Movies m2=new Movies(8.5f,"Super 30",2016);
		Movies m3=new Movies(9f,"Boduguard",2015);
		Movies m4=new Movies(6.3f,"Shershah",2021);
		Movies m5=new Movies(10f,"Hera Pheri",2008);
		Movies m6=new Movies(8.5f,"Udan",2020);
		Movies m7=new Movies(9.5f,"Badhai Ho",2019);
		Movies m8=new Movies(9.9f,"Fanaa",2006);
		Movies m9=new Movies(6.9f,"Mother India",1997);
		Movies m10=new Movies(8.8f,"Ashique",2019);
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al.add(m5);
		al.add(m6);
		al.add(m7);
		al.add(m8);
		al.add(m9);
		al.add(m10);
		
			    
		
		int c;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("========");
			System.out.println("M E N U ");
			System.out.println("========");
			System.out.println("1. Sort by ratings\n2. Sort by name\n3. Sort by year\n4. Sort by ratings in Reverse\n5. Sort by name in Reverse\n6. Sort by year in Reverse\n7. Exit");
		    System.out.println();
			System.out.print("Enter choice:");
		    c=sc.nextInt();
		    switch(c)
		    {
		    case 1:
		    	Comparator<Movies> cm1=Comparator.comparing(Movies::getRatings);
		    	Collections.sort(al,cm1);
		    	System.out.println();
		    	System.out.println("Sorting List by Rating:");
		    	System.out.println("=======================================");
		    	
		    	for(Movies v1:al)
		    	{
		    		System.out.println(v1);
		    	}
		    	break;
		    	
		    case 2:
		    	Comparator<Movies> cm2=Comparator.comparing(Movies::getName);
		    	Collections.sort(al,cm2);
		    	System.out.println();
		    	System.out.println("Sorting List by Name:");
		    	System.out.println("=======================================");
		    	
		    	for(Movies v2:al)
		    	{
		    		System.out.println(v2);
		    	}
		    	break;
		    	
		    case 3:
		    	Comparator<Movies> cm3=Comparator.comparing(Movies::getYear);
		    	Collections.sort(al,cm3);
		    	System.out.println();
		    	System.out.println("Sorting List by Year:");
		    	System.out.println("=======================================");
		    	
		    	for(Movies v3:al)
		    	{
		    		System.out.println(v3);
		    	}
		    	break;
		    	
		    case 4:
		    	Comparator<Movies> cm4=Comparator.comparing(Movies::getRatings);
		    	Collections.sort(al,cm4);
		    	Collections.reverse(al);
		    	System.out.println();
		    	System.out.println("Sorting List by Rating in Reverse Order:");
		    	System.out.println("=======================================");
		    	for(Movies v4:al)
		    	{
		    		System.out.println(v4);
		    	}
		    	
		    	break;
		    	
		    case 5:
		    	Comparator<Movies> cm5=Comparator.comparing(Movies::getName);
		    	Collections.sort(al,cm5);
		    	Collections.reverse(al);
		    	System.out.println();
		    	System.out.println("Sorting List by Name in Reverse Order:");
		    	System.out.println("=======================================");
		    	for(Movies v5:al)
		    	{
		    		System.out.println(v5);
		    	}
		    	
		    	break;
		    case 6:
		    	Comparator<Movies> cm6=Comparator.comparing(Movies::getYear);
		    	Collections.sort(al,cm6);
		    	Collections.reverse(al);
		    	System.out.println();
		    	System.out.println("Sorting List by Year in Reverse Order:");
		    	System.out.println("=======================================");
		    	for(Movies v6:al)
		    	{
		    		System.out.println(v6);
		    	}
		    	
		    	break;
		    
		    }
		
		  }while(c!=7);  
		
	}
}
		
class Movies {
	private float ratings;
	private String name;
	private int year;

	public Movies(float ratings, String name, int year) {

		this.ratings = ratings;
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Rating=" + ratings + ", Movie Name=" + name + ", Year=" + year;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}



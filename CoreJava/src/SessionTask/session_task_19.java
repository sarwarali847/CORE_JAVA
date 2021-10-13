/*
19. Create class as Student(stid,stname,mobile,email) and 
ask user to enter 5 students details.
Validate mobile and email before insert. (Regex and Java 8 Stream, Collectors)
Display students details whose mobile no. starts with 98.
Display students details whose email id is from gmail.
Count students whose email id is not from gmail.
*/

package SessionTask;

import java.util.Scanner;

public class session_task_19 {
	int stid;
	String name;
	String mobile;
	String gmail;
	

	public session_task_19(int stid, String name, String mobile, String gmail) {
		super();
		this.stid = stid;
		this.name = name;
		this.mobile = mobile;
		this.gmail = gmail;
	}


	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in); int n;
		  System.out.print("Enter number of students:"); n=sc.nextInt(); int[]
		  id2=new int[n]; 
		  String[] name2=new String[n]; 
		  String[] mobile2=new String[n];
		  String[] gmail2=new String[n];
		  String[] obj_name=new String[n];
		  //System.out.println("Enter object name:");
		  //for(int i=0;i<n;i++)
		  //{
			//  obj_name[i]=sc.nextLine();
		 // }
		  System.out.println("Enter id:"); 
		  for(int i=0;i<n;i++) 
		  { 
		  id2[i]=sc.nextInt();
		  //System.out.println("id "+i+" :"+id2[i]); 
		  } 
		  
		  
		  System.out.println("Enter name:"); 
		  for(int i=0;i<=n;i++) 
		  {
		try {
		  name2[i]=sc.nextLine(); 
		  obj_name[i]=name2[i];
		}
		catch(Exception e )
		{
		  e.getMessage();
		}
}
		  
		System.out.println("Enter mobile number"); 
		boolean a=false; 
		while(a==false)
		 {
		for(int i=0;i<n;i++)
		{ 
		try {
		String exp="\\d{10}"; 
		mobile2[i]=sc.nextLine();
		a=mobile2[i].matches(exp);
		if(a==false) 
		{
		System.out.println("Enter mobile number again:"); 
		} 
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	} 
} 
		  
		  
		  System.out.println("Enter gmail:"); 
		  boolean a2=false;
		  while(a2==false) 
		  {
		  for(int i=0;i<n;i++) 
		  { 
		 try {
			 
		  String exp2="\\w{1,}\\@\\w{1,}\\.\\w{1,3}";
		  gmail2[i]=sc.nextLine(); 
		  a2=gmail2[i].matches(exp2); 
		  if(a2==false)
		  System.out.println("Enter gmail again:");
		  }
		 catch(Exception e)
		 {
			 e.getMessage();
		 }
	}
    }
	//for(int i=0;i<n;i++)
	session_task_19 obj1=new session_task_19(id2[0],name2[0],mobile2[0],gmail2[0]);
	session_task_19 obj2=new session_task_19(id2[1],name2[1],mobile2[1],gmail2[1]);
	session_task_19 obj3=new session_task_19(id2[2],name2[2],mobile2[2],gmail2[2]);
	session_task_19 obj4=new session_task_19(id2[3],name2[3],mobile2[3],gmail2[3]);
	session_task_19 obj5=new session_task_19(id2[4],name2[4],mobile2[4],gmail2[4]);
	
	
	session_task_19[] myobj= {obj1,obj2,obj3,obj4,obj5};
	System.out.println();
	System.out.println("Students whose number starts with '98':");
	System.out.println("====================================================================");
	for(session_task_19 value:myobj)
	{
		if(value.mobile.startsWith("98"))
		{
			System.out.println("Name:"+value.name+", Id:"+value.stid+", Mobile:"+value.mobile+", Email:"+value.gmail);
		}
	}
	System.out.println();
	System.out.println();
	System.out.println("Students whose email domain is gmail:");
	System.out.println("====================================================================");
	
	for(session_task_19 value:myobj)
	{
		if(value.gmail.endsWith("gmail.com"))
		{
			System.out.println("Name:"+value.name+", Id:"+value.stid+", Mobile:"+value.mobile+", Email:"+value.gmail);
		}
	}
	System.out.println();
	System.out.println();
	System.out.println("Students whose email id is not from gmail:");
	System.out.println("====================================================================");
     int counter=0;
	for(session_task_19 value:myobj)
	{
		if(!(value.gmail.endsWith("gmail.com")))
		{  
			
			System.out.println("Name:"+value.name+", Id:"+value.stid+", Mobile:"+value.mobile+", Email:"+value.gmail);
			counter++;
		}
	}
		System.out.println("Conter:"+counter);
	
	}
	}
	
	

/* List: ArrayList and LinkedList,

Comparable
Iterator, ListIterator


Create class Book : book id, book name, book price and array of authors  having authornames,
getters setters and toString
Implement ArrayList to store Book Objects (named bookList)
and perform following tasks on this List

Take user choice 
1. Add New book in arraylist
2. Search any Book on the basis of book Id
3. Search any Book on the basis of name
4. Search any book on the basis of author
5. Delete any book by using book id
6. Display whole arraylist using ListIterator
*/


package SessionTask;
import java.util.*;
public class Java_Assignments_Vina_Maam {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Book> booklist =new ArrayList<Book>();
		booklist.add(new Book(123,"LEARN C",345.98,"SARWAR"));
		booklist.add(new Book(213,"LEARN CPP",245.98,"SAHIL"));
		booklist.add(new Book(892,"LEARN PYTHON",590,"JOHN"));
		booklist.add(new Book(733,"LEARN JAVA",212.12,"MIACHEL"));
		booklist.add(new Book(322,"CORE JAVA",980,"ROSE"));
		booklist.add(new Book(3,"ORACLE",880,"CONOR"));
		booklist.add(new Book(4,"MYSQL",1200,"JUSTIN"));
		
          int c;
//	     Iterator<Book> itr=booklist.iterator();
//		while(itr.hasNext())
//		{
//			Book b=itr.next();
//			System.out.println(b);
//		}
		do {
		System.out.println("----------");
		System.out.println("M  E  N  U");
		System.out.println("-----------");
		System.out.println("1. Add New book in arraylist.\n2. Search any Book on the basis of book Id.\n3. Search any Book on the basis of name.\n4. Search any book on the basis of author.\n5. Delete any book by using book id.\n6. Show List.\n7. Exit");
		System.out.println();
		System.out.print("Enter choice:");
		c=sc.nextInt();
		switch(c)
		{
		case 1:
			int id;
			String b_name;
			String a_name = "[ ";
			double p_book;
			System.out.println();
			System.out.print("Enter Book Id:");
			id=sc.nextInt();
			System.out.print("Enter Book Name:");
			sc.nextLine();
			b_name=sc.nextLine();
			System.out.print("Enter Book Price:");
			p_book=sc.nextDouble();
			System.out.print("Enter number of authors:");
			int n;
			n=sc.nextInt();
			System.out.println("Enter Author Names:");
			//booklist.add
	        String[] author=new String[n];
			for(int j=0;j<n;j++)
			{
				author[j]=sc.next();
			}
			for(int i=0;i<n;i++)
			{
				if(i<(n-1))
				a_name=a_name+author[i]+", ";
				if((i+1)==n)
				{
					a_name=a_name+author[i]+" ]";
				}
			}
				
			
			booklist.add(new Book(id,b_name.toUpperCase(),p_book,a_name.toUpperCase()));
				
			
//			Iterator<Book> itr=booklist.iterator();
//			while(itr.hasNext())
//			{
//				Book b=itr.next();
//				System.out.println(b);
//			}
			
		break;
		
	case 2:
		int b_id,f = 0;
		System.out.println();
		System.out.print("Enter Book Id:");
		b_id=sc.nextInt();
		Iterator<Book> itr=booklist.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			if(b.getBook_Id()==b_id)
			{
				System.out.println(b);
				f=0;
			}
			else
			{
				//System.out.println("Entered Book Id not found in the list.");
				f=1;
			}
		}
		if(f==1) {
			System.out.println("Entered Book Id not found in the list.");	
		}
		
		break;
	
	case 3:
		String name;
		System.out.println("Enter Book Name:");
		name=sc.next();
		name=name.toUpperCase();
		for(Book obj2:booklist)
		{
			if(obj2.getBook_Name().contains(name))
			{
				System.out.println(obj2);
			}
			
		}
		
		break;
	
	case 4:
		String name2;
		String v1="1";
		System.out.println("Enter Author Name:");
		name2=sc.next();
		name2=name2.toUpperCase();
		for(Book obj3:booklist)
		{
			if(obj3.getBook_Author().contains(name2))
			{
				System.out.println(obj3);
				v1="FALSE";
			
			}
			else if(!(obj3.getBook_Author().contains(name2)))
			{
				v1="TRUE";
				continue;	
			}
			
		}
		if(v1.equals("1") && v1.equals("TRUE"))
         { 
	        System.out.println("Author name not found.");
          }
		break;
		
	case 5:
		int d_id;
		System.out.println("Enter Book Id:");
		d_id=sc.nextInt();
		try {
		for(Book obj4:booklist)
		{
			if(obj4.getBook_Id()==d_id)
			{
				booklist.remove(obj4);
			}
		}
		}catch (ConcurrentModificationException e) {
			e.getStackTrace();
		}
		break;
		
	case 6:
		for(Book obj5:booklist)
		{
			System.out.println(obj5);
		}
		
	
		}
		
		
		
		
	}while(c!=7);

}
}

class Book{
	private int Book_Id;
	private String Book_Name;
	private double Book_Price;
	private String Book_Author;
	public Book(int book_Id, String book_Name, double book_Price, String book_Author) {
		Book_Id = book_Id;
		Book_Name = book_Name;
		Book_Price = book_Price;
		Book_Author = book_Author;
	}
	
	
	
	public int getBook_Id() {
		return Book_Id;
	}



	public void setBook_Id(int book_Id) {
		Book_Id = book_Id;
	}



	public String getBook_Name() {
		return Book_Name;
	}



	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}



	public double getBook_Price() {
		return Book_Price;
	}



	public void setBook_Price(double book_Price) {
		Book_Price = book_Price;
	}



	public String getBook_Author() {
		return Book_Author;
	}



	public void setBook_Author(String book_Author) {
		Book_Author = book_Author;
	}



	@Override
	public String toString() {
		
		return "Book Id:"+Book_Id+" , Book Name:"+Book_Name+" , Book Price:"+Book_Price+" , Book Author:"+Book_Author;
	}
}


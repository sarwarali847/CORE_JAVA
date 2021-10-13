/*/*Write a program for creation of user defined exception*/

package Lab_Unit__10;

public class Lab_10_5 {

	public static void main(String[] args) {
		TestException t=new TestException();
		try {
			t.validate(20);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Exception occured : "+e.getLocalizedMessage());
		}
		finally {
			System.out.println("Done!");
		}

	}

}
class InvalidAgeException extends Exception{
	public InvalidAgeException(String s)
	{
		super(s);
	}
	
	
}
class TestException{
	void validate(int age) throws InvalidAgeException {
		if(age<18)
			throw new InvalidAgeException("Age is not valid to vote");
		else
			System.out.println("Welcome to vote");
	}
}

package ExceptionHandling;

public class Example6 {
	
	public static void throwException()
	{
		throw new NullPointerException("Hamzaa");
	}
	
public static void main(String[] args) {
	
	System.out.println("Hello");
	try {
	throwException();
	}	
    catch(NullPointerException e) 
	{
		System.out.println("ExceptionHandling");
	}
	System.out.println("Bye");
	
	
}
}

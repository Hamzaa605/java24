package ExceptionHandling;

public class Example5 {
public static void main(String[] args) {
	
	try {
		System.out.println(5/0);
	}
	catch(ArithmeticException e) 
	{
		System.out.println("Exception Handled");
	}
	
	finally 
	{
		System.out.println("finally block");
	}
	
	System.out.println("code after Exception");
}
}

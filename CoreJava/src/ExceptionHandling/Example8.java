package ExceptionHandling;

public class Example8 {
	
	public static void checkNumber(int n) throws NegativeNumberException
	{
		if(n>=0) 
		{
			System.out.println(n);
		}
		else 
		{
			throw new NegativeNumberException("Number is Negative");
		}
	}
	
public static void main(String[] args) {
	
	try {
		checkNumber(-6);
	} catch (NegativeNumberException e) {
		
		System.out.println(e);
	}
	
}
}

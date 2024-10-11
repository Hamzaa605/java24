package ExceptionHandling;

public class Example7 {
	
	public static void checkAge(int age) {
		if(age<18) 
		{
			throw new InvalidAgeException("Age is invalid");
		}
		else 
		{
			System.out.println("Redistration successfull");
		}
	}
	
public static void main(String[] args) {
	
	checkAge(13);
}
}

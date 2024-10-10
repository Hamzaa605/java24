package ExceptionHandling;

import java.util.*;

public class Example3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	try {
	System.out.println("Enter first number");
	 int n=sc.nextInt();
	 
	 System.out.println("Enter second number");
	 int y=sc.nextInt();
	 
	 System.out.println("Division is"+(n/y));
    }
	catch(InputMismatchException a) 
	{
		System.out.println("invalid input");
	}
	catch(ArithmeticException b) 
	{
		System.out.println("Number cannot be divided by 0");
	}
}
}

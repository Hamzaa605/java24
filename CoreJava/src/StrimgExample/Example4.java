package StrimgExample;

import java.util.Scanner;

public class Example4 {
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  
	  String password="X#123";
	  
	  System.out.println("Enter Password");
	  String pwd=sc.nextLine();
	  
	  if(password.equals(pwd))
// if(password.compareto(pwd)==0)		  
		  System.out.println("Login Successfull");
	  else
		  System.out.println("Login Failed");
	  
	  
			  
			  
}
}

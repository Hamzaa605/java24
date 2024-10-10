package ExceptionHandling;

public class Example4 {
  public static void main(String[] args) {
	
	  String s="Laptop";
	  try {
	  System.out.println(s.charAt(80));
	}catch(StringIndexOutOfBoundsException e) 
	{
		System.out.println("wrong input");
	}
}
}

package StrimgExample;

public class Example1 {
  public static void main(String[] args) {
	
	  //ways to create string
	  //1} by using string literal
	  
	  String a="Hello";
	  String c="Hello";
	  
	  
	  //2}by using new keyword
	  
	String b=  new String("Hello");
	String d=  new String("Hello");
	
	System.out.println("================================================================");
	
	System.out.println(a==b);
	System.out.println(a==c);
	System.out.println(b==d);  
}
}

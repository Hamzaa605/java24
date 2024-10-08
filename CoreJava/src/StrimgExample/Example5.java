package StrimgExample;

public class Example5 {
  public static void main(String[] args) {
	
	  
	  String a="Hamza";
	  System.out.println(a.toUpperCase());
	  System.out.println(a);
	  
	  String b="hamza";
	  b=b.toUpperCase();
	  System.out.println(b.toUpperCase());
	  System.out.println(b);
	  
	  
	  System.out.println("=============================================================================");
	  
	  String s1="Hello";
	  s1=s1.concat(" world");
	  
	  System.out.println(s1);
	  
	  System.out.println("=============================================================================");

	  System.out.println("He          ll            o".trim()+"world");
	  
	  System.out.println("=============================================================================");
	  
	  System.out.println("Hamzaa".length());
	  
	  System.out.println("=============================================================================");
	  
	  System.out.println("Janki".charAt(3));
	  
	  System.out.println("=============================================================================");
	  
	  System.out.println("Hamza".indexOf('H'));
	  System.out.println("Guru".indexOf('u', 2));
	  
	  System.out.println("=============================================================================");
	  
	  System.out.println("Mobile".startsWith("M"));
	  
	  System.out.println("=============================================================================");
	  
	  String s2="Bottle";
	  char arr[]=s2.toCharArray();
	  for(char ch:arr) 
	  {
		  System.out.println(ch);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
}

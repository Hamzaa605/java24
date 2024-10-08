package StrimgExample;

public class Example7 {
  public static void main(String[] args) {
	  
	  
	StringBuilder sb=new StringBuilder("Hello");
	
	sb.reverse();
	
	System.out.println(sb);
	
    sb.reverse();
	
	System.out.println(sb);
	
	System.out.println("=============================================================================");
	
	sb.replace(0, 2, "*********");
	
	System.out.println(sb);
	
	System.out.println("=============================================================================");
	
	sb.append("world");
	
	System.out.println(sb);
	
	System.out.println("=============================================================================");
	
	sb.delete(0, 12);
	
	System.out.println(sb);
}
}

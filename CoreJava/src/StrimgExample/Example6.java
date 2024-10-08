package StrimgExample;

public class Example6 {
  public static void main(String[] args) {
	String s1="MoooOOOObile";
	
	int count=0;
	
	for(int i=(s1.length()-1);i>=0;i--) 
	{
		System.out.print(s1.charAt(i));
		
	}
	
	
	System.out.println("=============================================================================");
	
	for(char ch:s1.toCharArray()) 
	{
		if(ch=='o'||ch=='O')
			count++;
	}
	
	System.out.println(count);
}
}

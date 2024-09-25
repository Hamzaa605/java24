package inheritance;

class C
{

   
   C()
	{
		System.out.println("C Non-Parameterised Constructor");
	}
   C(String value)
   {
	   System.out.println("Parameterised Constructor(C)="+value);
   }
}

class D extends C
{
   
   
   D()
	{
		System.out.println("D Non-Parameterised Constructor");
	}
   D(String value)
   {
	   super(value);
	   System.out.println("Parameterised Constructor(D)="+value);
   }
}

public class SuperExample {
  public static void main(String[] args) {
	
	  new D("HELLO");
}
}

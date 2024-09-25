package inheritance;

class A
{
 int add(int a,int b)
   {
	   return a+b;
   }	
   
   A()
	{
		System.out.println("A Constructor");
	}
   A(String value)
   {
	   System.out.println("Parameterised Constructor(A)="+value);
   }
}

class B extends A
{
   int sub(int a,int b)
   {
	   return a-b;
   }	
   
   B()
	{
		System.out.println("B Constructor");
	}
   B(String value)
   {
	   super(value);
	   System.out.println("Parameterised Constructor(B)="+value);
   }
}

public class SingleInheritance {
  public static void main(String[] args) {
	// ADDITION
	  B obj=new B("xyz");
	  int sum=obj.add(19, 3);
	  System.out.println(sum);
	// SUBRACTION
	  System.out.println(obj.sub(20, 6));
}
}

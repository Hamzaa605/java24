import java.util.*;
class java_ladder2
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter two number");
	 int a=10;
	 int b=16;
	 System.out.println("1:add 2:sub 3:mul 4:div");
	 int n=sc.nextInt();
	 
	 
	 if(n==1)
	 {
		 System.out.println("a+b=26");
	 }
	 else if(n==2)
	 {
		 System.out.println("a-b=-6");
	 }
	  else if(n==3)
	 {
		 System.out.println("a*b=160");
	 }
	  else if(n==4)
	 {
		 System.out.println("a%b=0.625");
	 }
	 else
	 {
		 System.out.println("Invalid");
	 }
	}
}
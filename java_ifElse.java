import java.util.Scanner;
class java_ifElse
{
	public static void main(String args[])
	{
		/*
		if(true)
		{
			System.out.println("if block");
		}
		else
		{
			System.out.println("else block");
		}
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println(n+"is even");
		}
		else
		{
			System.out.println(n+"is odd");
		}
	}
}
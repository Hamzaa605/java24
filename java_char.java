import java.util.Scanner;
class java_char
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean subscribed=false;
		
		System.out.println("Do you want to subscribed ?? (y/n)");
		char decision=sc.next().charAt(0);

		if(decision=='y' || decision=='Y')
		{
			subscribed=true;
		}
		System.out.println("subscribed:"+subscribed);
		
		if(subscribed)
		{
			System.out.println("You are subscribed");
		}
		else
		{
			System.out.println("You are not subscribed");
		}
	}
}
import java.util.*;
class java_ifElse3
{
	public static void main(String args[])
	{
		int n=12;
		if(n%3==0)
		{
			System.out.println(n+"is multiple of 3");
			if(n%2==0){
				System.out.println(n+"is even");
			}	
			else
			{
				System.out.println(n+"is odd");
			}
			}
			else
			{
			System.out.println(n+"is not multiple of 3");	
			}
	}
}
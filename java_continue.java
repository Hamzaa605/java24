import java.util.*;
class java_continue
{
	public static void main(String args[])
	{
		/*Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			continue;
			if(i==3)
			
			System.out.println(i);
			
				
		}*/
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			
			int n=sc.nextInt();
			if(n<0)
				continue;
			sum=sum+n;
			
		}
		System.out.println("sum is "+sum);
	}
}
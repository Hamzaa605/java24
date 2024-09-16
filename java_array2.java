import java.util.*;
class java_array2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int numbers[]=new int[5];
		/*
		numbers[0]=sc.nextInt();
		numbers[1]=sc.nextInt();
		numbers[2]=sc.nextInt();
		numbers[3]=sc.nextInt();
		numbers[4]=sc.nextInt();
		*/
		
		for(int i=0;i<5;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println("=====================");
		for(int i=0;i<5;i++)
		{
			System.out.println(numbers[i]);
		}
	}
	
	
}
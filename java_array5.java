import java.util.*;
class java_array5
{
    public static void main(String args[])
	{
		/*
		int number[][]={{12,450,23},{45,230,90}};
		
		System.out.println(number[0][0]);
		System.out.println(number[1][0]);
		*/
		
		int arr1[][]={{12,45,23},{45,23,90}};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr1[i][j]);
			}
		}
		
		System.out.println("===========================");
		
		for(int n[]:arr1)
		{
			 for(int i:n)
			 {
				System.out.println(i); 
			 }
		}
		
		System.out.println("===========================");
		
		int arr2[][]={{26,21},{12,45,23},{45,23,90,76}};
		
		for(int m[]:arr2)
		{
			System.out.println(m.length);
		}
		
		
	}
}
import java.util.*;
class java_array6
{
    public static void main(String args[])
	{
		String courses[][]={
			{"HTML","CSS","JAVASCRIPT"},
			{"MYSQL","MONGODB"},
			{"CORE JAVA","SPRING BOOT"}};
			
			int t_c=0;
			
		for(String n[]:courses)
	     {
			 t_c+=n.length;
			 
			for(String c_name:n)
			{ 
			System.out.println(c_name);
			}
			
			
	     }
		 System.out.println("total courses="+t_c);
		}
		
		int a[][]={{1,3,5},{3,5,8}};
		
		for(int m[]:a)
		{
			for(int i:m)
			{
				System.out.print(i+"  ");
			}
		}
	}

import java.util.*;
class java_array3
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  
	  /*System.out.println(args[0]);
	  System.out.println(args[1]);*/
	  
	  String weekdays[]={"MON","TUE","WED","THU","FRI","SAT","SUN"};
	  
	  int primenumbers[]={11,13,17,5};
	  
	  System.out.println("Weekdays:"+weekdays.length);
	  System.out.println("PRIMENUBERS:"+primenumbers.length);
	  
	  // enhanced for loop
	  for(int num:primenumbers)
	  {
		  System.out.println(num);
	  }
	  
	  System.out.println("=============");
	  
	  for(String day:weekdays)
	  {
		  System.out.println(day);
	  }
	  
	  int number[]={1,4,6,2,45};
	  
	  int sum=0;
	  
	  for(int nums:number)
	  {
		 sum=sum+nums;
		 
	  }
	  System.out.println("total is "+sum);
	  
	  //--------------------------------
	  
	  char ch[]={'a','e','i','a','c','a'};
	  
	  int count=0;
	  
	  for(char chs:ch)
	  {
		  if(chs=='a')
			  count++;
	  }
	  System.out.println("A "+count);
	  
	  //----------------------------------------
	  
	  char vo[]={'a','i','t','e'};
	  
	  int vowels=0;
	  int consonants=0;
	  for(char vow:vo)
	  {
		  if(vow=='a'||vow=='e'||vow=='i'||vow=='o'||vow=='u')
		  vowels++;
	     else
			 consonants++;
	  }
	  System.out.println("vowels="+vowels);
	  System.out.println("consonants= "+consonants);
	  
	}
}
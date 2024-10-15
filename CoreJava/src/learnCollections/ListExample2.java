package learnCollections;

import java.util.ArrayList;

public class ListExample2 {
   public static void main(String[] args) {
	
	   ArrayList<Integer> lists=new ArrayList<Integer>();
	   
	   lists.add(45);//0
	   lists.add(10);//1
	   lists.add(16);//2
	   lists.add(19);//3
	   
	   System.out.println(lists);

	   System.out.println("1--------------------------------");
	   
	  for(Integer b:lists) 
	  {
		  System.out.println(b);
	  }
	  
	  System.out.println("2--------------------------------");
	  
	  lists.remove(0);
	   System.out.println(lists);
	 
	   System.out.println("3--------------------------------");
	   
	   System.out.println(lists.size());
	   
	   System.out.println("4--------------------------------");
	   
	   lists.remove(lists.size()-1);
		System.out.println(lists);
		
		System.out.println("5--------------------------------");
		
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(101);
		list2.add(102);
		list2.add(103);
		
		lists.addAll(list2);
		System.out.println(lists);
		
		
		System.out.println("6--------------------------------");
		
		
		lists.removeAll(list2);
		System.out.println(lists);
}
}

package learnCollections;

import java.util.ArrayList;

public class ListExample1 {
   public static void main(String[] args) {
	// Array is fixed in size
    // ArrayList is dynamic (Add or REMOVE)
	 
	   ArrayList list=new ArrayList<>();
	   list.add(56);
	   list.add("A");
	   list.add(23.96);
	   list.add(null);
	   
	   System.out.println(list);
	   
	   for(Object i:list) 
	   {
		   System.out.println(i);
	   }
	 
}
}

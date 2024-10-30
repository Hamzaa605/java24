package learnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class StreamExample10 {
	
public static void main(String[] args) {
	
   ArrayList<Integer> list = new ArrayList<Integer>();
   
   for(int i=1;i<=100;i++) 
   {
	   list.add(i);
   }
   
   System.out.println(list);
   
  /* Optional<Integer> any = list.parallelStream().findAny();
   System.out.println(any);*/
   
          list.parallelStream().forEach(n->System.out.println(n));
          
          System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
          
          boolean anyMatch = list.stream().anyMatch(n->n%2==0);
          System.out.println(anyMatch);
          
          boolean anyMatch2 = list.stream().anyMatch(n->n>1000);
          System.out.println(anyMatch2);
          
          System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
          
          boolean allMatch = list.stream().allMatch(n->n>0);
          System.out.println(allMatch);
          
          System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
          
          boolean noneMatch = list.stream().noneMatch(n->n==1);
          System.out.println(noneMatch);
}
}
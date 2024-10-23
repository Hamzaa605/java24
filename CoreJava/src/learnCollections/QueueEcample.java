package learnCollections;

import java.util.PriorityQueue;

public class QueueEcample {
   public static void main(String[] args) {
	
//	   System.err.println("Hello");
	   
	   
	   // Queue PriorityQueue
	   
	   PriorityQueue<Integer> numbers=new PriorityQueue<Integer>();
	   
	   for(int i=1;i<=20;i++) 
	   {
		    numbers.add(i);
	   }
	   
	   System.out.println(numbers);
	   
	   System.out.println("=======================================================");
	   
	   // Poll
	   
	   System.out.println(numbers.poll());//1
	   System.out.println(numbers.poll());//2
	   System.out.println(numbers.poll());//3
	   System.out.println(numbers.poll());//4
	   System.out.println(numbers);
	   
	   System.out.println("=======================================================");
	   
	  
	   // PriorityQueue with Camparator
	   
      PriorityQueue<Integer> number=new PriorityQueue<Integer>((i1,i2)->i2-i1);
	   
	   for(int i=1;i<=20;i++) 
	   {
		    number.add(i);
	   }
	   
	   System.out.println(number);
	   
	   System.out.println("=======================================================");
}
}

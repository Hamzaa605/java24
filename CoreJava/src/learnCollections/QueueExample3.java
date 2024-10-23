package learnCollections;

import java.util.LinkedList;

public class QueueExample3 {
public static void main(String[] args) {
	
	LinkedList<Integer> numbers=new LinkedList<Integer>();
	
	numbers.addLast(50);
	
	for(int i=1;i<=10;i++) 
	{
		numbers.add(i);
	}
	
	numbers.addFirst(12);
	System.out.println(numbers);
	
	System.out.println("==============================================================");
	
	numbers.removeFirst();//Pollfirst
	System.out.println(numbers);
	
	numbers.removeLast();//Polllast
	System.out.println(numbers);
	
	System.out.println("==============================================================");
	
	System.out.println(numbers.getFirst());//peekfirst
	System.out.println(numbers.getLast());//peeklast
	
	
}
}

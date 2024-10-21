package learnCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class ListExample8 {
public static void main(String[] args) {
	
	LinkedList<Integer> list=new LinkedList<Integer>();
	list.add(12);
	list.add(20);
	list.add(30);
	
	Iterator<Integer> iterator = list.iterator();
	
	/*System.out.println(iterator.next());
	System.out.println(iterator.next());
	System.out.println(iterator.next());*/
	
	while(iterator.hasNext()) 
	{
		System.out.println(iterator.next());
	}
	
}
}

package learnCollections;

import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExample4 {
   
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(12);
		list.add(15);
		list.add(20);
		
		System.out.println(list);
		
		for(Integer i:list) 
		{
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------");
		
		list.add(0,100);
		System.out.println(list);
		
		System.out.println("--------------------------------------");
		
		Integer i = list.get(3);
		System.out.println(i);
		
		System.out.println("--------------------------------------");
		
		list.set(0, 200);
		System.out.println(list);
		
		System.out.println("--------------------------------------");
		
		//Predicate<Integer> even=(num)->num%2==0;
		list.removeIf((num)->num%2==0);
	  //list.removeIf((num)->num%2==1);
		System.out.println(list);
		
		System.out.println("--------------------------------------");
		
		
	}
	
}

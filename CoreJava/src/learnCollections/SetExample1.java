package learnCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetExample1 {
public static void main(String[] args) {
	
	HashSet<Integer> hashSet = new HashSet<Integer>();
	hashSet.add(10);
	hashSet.add(10);
	hashSet.add(20);
	hashSet.add(30);
	
	System.out.println(hashSet);
	
	
	System.out.println("--------------------------------");
	
	List<Integer> list = Arrays.asList(12,67,67,89,90,90);
	System.out.println(list);
	
	HashSet<Integer> Set = new HashSet<Integer>();
	System.out.println(hashSet);
	
	HashSet<Integer> set=new HashSet<Integer>();
	System.out.println(set);
	
}
}

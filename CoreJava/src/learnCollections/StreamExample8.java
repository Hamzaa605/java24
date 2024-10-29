package learnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StreamExample8 {

	public static void main(String[] args) {
		
		//List<Integer> numbers = Arrays.asList(1,3,6,2);
		List<Integer> numbers = new ArrayList<Integer>();
		
		
		Optional<Integer> addtion = numbers.stream().reduce((a,b)->a+b);
		System.out.println(addtion);
		
		Integer integer = addtion.get();
		System.out.println(integer);
		
		Integer i = addtion.orElseThrow(()->new RuntimeException("List is empty"));
		System.out.println(i);
		
	}
	
}

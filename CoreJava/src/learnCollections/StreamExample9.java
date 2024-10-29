package learnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StreamExample9 {

	public static void main(String[] args) {
		
		/*List<Integer> numbers = Arrays.asList(12,45,3,4,9);*/
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		
		 Optional<Integer> first = numbers.stream().findFirst();
		 System.out.println(first);
		 
		 //Integer integer = first.get();
		 //System.out.println(integer);
		 
		 Integer orElseThrow = first.orElseThrow(()->new ArithmeticException("list is empty"));
		 System.out.println(orElseThrow);
		 
		 
		 
		 
		
	}
	
}

package learnCollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample5 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,45,13,78,79);
		
		//FILTER
		numbers.stream()
		.filter(n->n>20)
		.forEach(n->System.out.println(n));
		
		System.out.println("=====================================");
		
		Collector<Object, ?, List<Object>> list = Collectors.toList();		
		List<Integer> greaterThan20 =  numbers.stream()
				                      .filter(n->n>20)
				                      .collect(Collectors.toList());
		
		System.out.println(greaterThan20);
		
		System.out.println("=====================================");
		
		List<String> names = Arrays.asList("Nisha","Manisha","Nilkita","Ankita");
		
		List<String> nameStartWithN =  names.stream()
				                      .filter(name->name.startsWith("N"))
				                      .collect(Collectors.toList());
		
		System.out.println(nameStartWithN);
		
		
		
		
	}
	
}

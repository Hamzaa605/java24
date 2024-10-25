package learnCollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample4 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,34,22,55,24,23,44);
		
		Stream<Integer> even = list.stream().filter(n->n%2==0);
		even.forEach(a->System.out.println(a));
		
	}
	
}

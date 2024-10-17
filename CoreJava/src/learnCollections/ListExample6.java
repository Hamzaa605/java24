package learnCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample6 {
public static void main(String[] args) {
	
	List<Integer> numbers = Arrays.asList(10,50,30,40,20,0);
	System.out.println(numbers);
	
	System.out.println("--------------------------------------");
	
	Collections.sort(numbers);
	System.out.println(numbers);
	
	System.out.println("Smallest element="+numbers.get(0));
	
	System.out.println("Largest element="+numbers.get(numbers.size()-1));
	
}
}

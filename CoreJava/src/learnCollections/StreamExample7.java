package learnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample7 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,5,6,7);
		Function<Integer, Integer> squareFuction=(n)->n*n;
		List<Integer> listOfSquares = numbers.stream()
				                     .map(squareFuction)
				                     .collect(Collectors.toList());
		
		System.out.println(listOfSquares);
		
		System.out.println("=============================================");
		
		
		List<Integer> multipleOf10 = numbers.stream()
				                     .map((n)->n*10)
				                     .collect(Collectors.toList());
		
		System.out.println(multipleOf10);
		
		System.out.println("=============================================");
		
		List<String> names = Arrays.asList("Pooja","Amit","Joel","Sanika","Gurjeet","Hamzaa");
		List<Integer> Size = names.stream()
				             .map(name->name.length())
				             .collect(Collectors.toList());
		
		System.out.println(Size);
		
		System.out.println("=============================================");
		
		List<Product> products= new ArrayList<Product>();
		
		products.add(new Product(104, "Laptop", 50000));
		products.add(new Product(102, "Mobile", 35000));
		products.add(new Product(103, "Headphones", 7000));
		
		List<String> nameOfProduct = products.stream()
				                    .map(a->a.getName())
				                    .collect(Collectors.toList());
		
		System.out.println(nameOfProduct);
		
	}
	
}

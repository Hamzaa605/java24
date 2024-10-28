package learnCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample6 {
public static void main(String[] args) {
	
	List<Product> products= new ArrayList<Product>();
	
	products.add(new Product(104, "Laptop", 50000));
	products.add(new Product(102, "Mobile", 35000));
	products.add(new Product(103, "Headphones", 7000));
	
	List<Product> price =  products.stream()
			              .filter(p->p.getPrice()>10000)
	                      .collect(Collectors.toList());
	
	System.out.println(price);
	
	
	
}
}

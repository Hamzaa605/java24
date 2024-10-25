package learnCollections;

import java.util.ArrayList;
import java.util.List;

public class StreamExample3 {

	public static void main(String[] args) {
		
	List<Product> products=new ArrayList<Product>();
	products.add(new Product(104, "Laptop", 50000));
	products.add(new Product(102, "Mobile", 35000));
	products.add(new Product(103, "Headphones", 7000));
	
	products.stream().forEach(p->System.out.println(p.getName()+" "+p.getPrice()*0.8));
	
	System.out.println("===============================================");
	
	products.stream().forEach(d->System.out.println(d+" "+d.getPrice()*0.7));
	

	}
	
}

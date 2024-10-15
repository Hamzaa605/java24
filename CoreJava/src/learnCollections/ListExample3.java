package learnCollections;

import java.util.ArrayList;

public class ListExample3 {

	public static void main(String[] args) {
		
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(101, "Laptop", 50000));
		products.add(new Product(102, "Mobile", 35000));
		products.add(new Product(103, "Headphones", 7000));
		
		System.out.println(products);
		
		System.out.println("---------------------------");
		
		for(Product a:products) 
		{
			System.out.println(a);
			
		}
		
		System.out.println("---------------------------");
		
		for(Product a:products) 
		{
			if(a.getPrice()>20000)
			System.out.println(a);
			
		}
		
		System.out.println("---------------------------");
		
		for(Product a:products) 
		{
			if(a.getName().startsWith("M"))
			System.out.println(a);
			}
	}
	
}

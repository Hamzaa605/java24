package learnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExample5 {

	public static void main(String[] args) {
		
		LinkedList<String> Student=new LinkedList<String>();
		Student.add("Amit");
		Student.add("Guru");
		Student.add("Faiz");
		
		System.out.println(Student);
		
		//Predicate<String> word=(alpha)->alpha.startsWith("A");
		Student.removeIf((alpha)->alpha.startsWith("A"));
		System.out.println(Student);
		
		System.out.println("--------------------------------------");
		
		LinkedList<Product> products=new LinkedList<Product>();
		products.add(new Product(101, "Laptop", 50000));
		products.add(new Product(102, "Mobile", 35000));
		products.add(new Product(103, "Headphones", 7000));
		
		System.out.println(products);
		
		products.removeIf(p->p.getPrice()<10000);
		System.out.println(products);
		
		
	}
	
}

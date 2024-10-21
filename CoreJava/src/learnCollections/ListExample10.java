package learnCollections;

import java.util.Scanner;
import java.util.Stack;

public class ListExample10 {

public static <E> void main(String[] args) {
Scanner sc=new Scanner(System.in);

	Stack<Product> products= new Stack<Product>();
	
	products.add(new Product(104, "Laptop", 50000));
	products.add(new Product(102, "Mobile", 35000));
	products.add(new Product(103, "Headphones", 7000));
	
	System.out.println("Do yo want to delete last added item?(y/n)");
	
	System.out.println(products.peek());
	
	char decision=sc.next().charAt(0);
	
	if(decision=='Y'|| decision=='y')
	{
		System.out.println(products.peek().getName()+" deleted");
	}
	
}
}

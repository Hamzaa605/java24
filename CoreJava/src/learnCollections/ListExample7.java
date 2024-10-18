package learnCollections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExample7 {
   public static void main(String[] args) {
	
	   List<Product> products=new LinkedList<Product>();
	   
		products.add(new Product(104, "Laptop", 50000));
		products.add(new Product(102, "Mobile", 35000));
		products.add(new Product(103, "Headphones", 7000));
		products.add(new Product(101, "T.V", 70000));
		
		//ACE
		Comparator<Product> idComparator=(p1,p2)->p1.getId()-p2.getId();
		
		/*DEC
		 * Comparator<Product> idComparator=(p1,p2)->p2.getId()-p1.getId();
		 */
		
		//A TO Z
		Comparator<Product> nameComparator=(p1,p2)->p1.getName().compareTo(p2.getName());
		
		/*Z TO A
		 * Comparator<Product> nameComparator=(p1,p2)->p2.getName().compareTo(p1.getName());
		 */
		
		//ACE
		Comparator<Product> priceComparator=(p1,p2)->p1.getPrice()-p2.getPrice();
		
		/*DCE
		 * Comparator<Product> priceComparator=(p1,p2)->p2.getPrice()-p1.getPrice();
		 */
		
		
		Collections.sort(products,idComparator);
		System.out.println(products);
		System.out.println("----------------------------------------------------------------");
		
		Collections.sort(products,nameComparator);
		System.out.println(products);
		System.out.println("----------------------------------------------------------------");
		
		Collections.sort(products,priceComparator);
		System.out.println(products);
		
	   
}
}

package classesAndObjects;

public class Example2 {
 public static void main(String[] args) {
	
	category2 c1= new category2(1,"Electronics");
	System.out.println(c1.categoryId);
	System.out.println(c1.categoryName);
	
	category2 c2= new category2("Electronics",2);
	System.out.println(c2.categoryId);
	System.out.println(c2.categoryName);
}
}

package classesAndObjects;

public class Category {
	
	public static void main(String args[]) 
	{
	Product p1=new Product();
	p1.setProductDetails(101, "laptop", 50000);
	System.out.println("Pay :"+p1.discount());
	
	
	
	Product p2=new Product();
	p2.setProductDetails(102, "Mobile", 35000);
	System.out.println("Pay :"+p2.discount());
	
	Order p3=new Order();
	p3.setOrderDetails(111, "Faiz");
	
	}
}

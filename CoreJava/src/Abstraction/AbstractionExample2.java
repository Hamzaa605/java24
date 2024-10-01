package Abstraction;

abstract class Product
{
	abstract void details();
}

class mobile extends Product
{
	void details ()
	{
		System.out.println("Brand=Oneplus");
	}
}

public class AbstractionExample2 {
 public static void main(String[] args) {
	
	 mobile Mobile=new mobile();
	 Mobile.details();
	 
//Anonymous inner class	 
	 
	 Product Laptop=new Product() 
	 {
		 void details()
		 {
			 System.out.println("laptop details");
		 }
	 };
	 
	 Laptop.details();
	 
	 
	Product Headphones= new Product() 
	 {
		 void details() 
		 {
			 System.out.println("Headphones dretails");
		 }
	 };
	 
	 Headphones.details();
}
}

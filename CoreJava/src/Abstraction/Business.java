package Abstraction;


public class Business
{
	public static void main(String[] args) {
		
		new weekdays().coupons();
		
		BuisnessLogic	weekend=new BuisnessLogic() 
		{
			void coupons() 
			{
			  System.out.println("weekend discount");	
			}
			
		};
		
		weekend.coupons();
	}
}
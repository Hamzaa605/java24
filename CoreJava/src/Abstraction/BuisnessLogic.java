package Abstraction;

public abstract class BuisnessLogic {
	
	abstract void coupons();

}

class weekdays extends BuisnessLogic
{
	void coupons() 
	{
		System.out.println("weekdays discount");
	}
}

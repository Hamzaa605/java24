package Abstraction;

public class BankInterface {

	public static void main(String[] args) {
		
		/*SBI s1=new SBI();
		ICICI i1=new ICICI();
		s1.details();
		i1.details();*/
		
		/*Bank si=new ICICI();
		si.details();
		si.address();
		si.methodBank();
		Bank.staticMethod();*/
		
		Bank si=new SBI();
		si.details();
		si.address();
		si.methodBank();
		Bank.staticMethod();
		
		Bank a=new Bank() {
			
			public void details() {
				System.out.println("Details of AXIS Bank");
			}
			
			public void address() {
				System.out.println("Address of AXIS Bank");
			}
			
		};
		
		a.address();
		a.details();
		
		Bank h=new Bank() {
			
			public void details() {
				System.out.println("Details of HDFC Bank");
			}
			
			public void address() {
				System.out.println("Address of HDFC Bank");
			}
		};
		 
		h.details();
		h.address();
		
	}
}

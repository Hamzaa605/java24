package Abstraction;

public interface Bank {
	
	void details();
	
	void address();

	default void methodBank() {
		
		System.out.println("Default method");
	}
	
	static void staticMethod() {
		
		System.out.println("Static Method from Bank Interface");
	}
}

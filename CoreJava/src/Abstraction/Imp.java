package Abstraction;

public class Imp implements I1 {
	
	public void display() {
		System.out.println("overriden method of Imp class");
	}
	
	public void square(int n) {
		System.out.println(n*n);
	}
}

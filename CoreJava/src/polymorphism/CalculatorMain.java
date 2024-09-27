package polymorphism;

public class CalculatorMain {
  public static void main(String[] args) {
	Calculator c1=new Calculator();
	c1.add(10, 56);
	c1.add(2.70f, 3.56f);
	c1.add(24, 54, 48);
	c1.add1(34,56);
	c1.add1(24.45f, 45.67f);
	c1.add1(100,200, 100);
}
}

package staticKeyWord;

class StaticExample {
	
	static {
		System.out.println("Static Block");
	}
	
 public static void main(String[] args) {
	 Employee.ceo="Faiz";
	
	 Employee.changeCeo("Guru");
	 
	Employee e1=new Employee(101,"faizan");
	Employee e2=new Employee(102,"Amit");
	
	System.out.println(e1.ceo);
	System.out.println(e2.ceo);
	
	 
}
 

 
}

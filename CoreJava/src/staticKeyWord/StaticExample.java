package staticKeyWord;

class StaticExample {
 public static void main(String[] args) {
	 Employee.ceo="Faiz";
	
	Employee e1=new Employee(101,"faizan");
	Employee e2=new Employee(102,"Amit");
	
	System.out.println(e1.ceo);
	System.out.println(e2.ceo);
}
}

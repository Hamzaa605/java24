package inheritance;

public class Employee1 {
  public static void main(String[] args) {
	
	  
	  Employee e1=new Employee(101,"Amit",70000);
	  
	  
	  FullTimeEmployee ft1=new FullTimeEmployee(102,"guru",50000,21,"fr4536");
	  
	  
	  PartTimeEmployee pt1=new PartTimeEmployee(103,"chetan",60000,5000);
	  
	  Programmer p1=new Programmer(104,"Rayyan", 50000, 21,"Frs2451", "Jana");
}
}

package GenericAndFunctionInterfaces;

import java.util.function.Predicate;

import encapsulation.Student;

public class Example3 {
  public static void main(String[] args) {
	
	  
	 Predicate<Student> checkage=new Predicate<Student>() {
		
		@Override
		public boolean test(Student t) {
			// TODO Auto-generated method stub
			return t.getAge()>=18;
		}
	};
	
	Student ans=new Student(101, "Hamza", 17, 79877989);
	boolean a= checkage.test(ans);
}
}

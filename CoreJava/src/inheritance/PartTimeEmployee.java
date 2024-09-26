package inheritance;

public class PartTimeEmployee extends Employee
{
  int bonus;
  
  PartTimeEmployee(int id,String name,int monthlySalary,int bouns)
  {
	  super(id,name,monthlySalary);
	  this.bonus=bouns;
	  
	  System.out.println(id+" "+name+" "+monthlySalary+" "+bonus);
  }
}

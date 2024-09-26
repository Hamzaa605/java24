package inheritance;

public class FullTimeEmployee extends Employee
{

	int noOfLeaves;
	String insurance;
	
	FullTimeEmployee(int id,String name,int monthlySalary,int noOfLeaves,String insurance)
	{
		super(id,name,monthlySalary);
		this.noOfLeaves=noOfLeaves;
		this.insurance=insurance;
		
		System.out.println(id+" "+name+" "+monthlySalary+" "+noOfLeaves+" "+insurance);
	}
}

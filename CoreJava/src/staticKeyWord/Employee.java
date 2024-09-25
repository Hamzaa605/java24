package staticKeyWord;

public class Employee {

	int empId;
	String empName;
	static String ceo="Hamza";
	
	Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	 static void changeCeo(String ceoName){
		 ceo=ceoName;
	 }
}

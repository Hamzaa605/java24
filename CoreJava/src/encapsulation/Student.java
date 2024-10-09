package encapsulation;

public class Student {

	private int id;
	
	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId() 
	{
		return this.id;
	}
	
	
	
	private String name;
	
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName() 
	{
		return this.name;
	}
	
	
    private int Age;
	
	public void setAge(int Age) 
	{
		this.Age=Age;
	}
	public int getAge() 
	{
		return this.Age;
	}
	
    private int PhoneNO;
	
	public void setPhoneNO(int PhoneNo) 
	{
		this.PhoneNO=PhoneNo;
	}
	public int getPhoneNO(String password) 
	{
		if(password.equals("U@1"))
		return this.PhoneNO;
		else
			return 0;
	}
	
	public String toString() 
	{
		return "Mohammed Hamzaa Shaikh";
	}
	
}

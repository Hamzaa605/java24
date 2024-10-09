package encapsulation;

public class ECP1 {
public static void main(String[] args) {
	
	//ID
	
	Student s1=new Student();
	s1.setId(101);
	// System.out.println(s1.getId());
	int id=s1.getId();
	System.out.println(id);
	System.out.println(s1);
	//NAME
	
	Student s2=new Student();
	s2.setName("Amit");
	// System.out.println(s1.getName());
	String name=s2.getName();
	System.out.println(name);
	
	//AGE
	
	Student s3=new Student();
	s3.setAge(24);
	// System.out.println(s1.getAge());
	int Age=s3.getAge();
	System.out.println(Age);
	
	//PhoneNo
	
	Student s4=new Student();
	s4.setPhoneNO(655777);
	// System.out.println(s1.getPhoneNo());
	int PhoneNo=s4.getPhoneNO("U@1");
	System.out.println(PhoneNo);
	
	
}

}

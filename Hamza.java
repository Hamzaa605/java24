class Student
{
	int rollNO;
	String name;
}

class Hamza
{
	public static void main(String args[])
	{
		Student s1=new Student();
		
		s1.rollNO=101;
		s1.name="amit";
		
		System.out.println(s1.rollNO);
		System.out.println(s1.name);
		
		Student s2=new Student();
		
		s2.rollNO=102;
		s2.name="Faiz";
		
		System.out.println(s2.rollNO);
		System.out.println(s2.name);
		
	}
}
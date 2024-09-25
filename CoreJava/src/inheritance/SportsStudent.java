package inheritance;

class SportStudent extends Student
{
	int graceMarks;
	String sportsName;
	
	SportStudent(int rollNo,String name,int marks,int graceMarks,String sportsName)
	{
		super(int rollNo,String name,int marks);
		this.graceMarks=graceMarks;
		this.sportsName=sportsName;
	}
}



package inheritance;

public class CollegePassOutPerson extends SchoolPassOutPerson
{
	
	String collegeCertificateNO;
	
	CollegePassOutPerson(int id,String name,String schoolCertificateNO,String collegeCertificateNO)
	{
	   super(id,name,schoolCertificateNO);
	   this.collegeCertificateNO=collegeCertificateNO;
	   
	   System.out.println(id+"  "+name+"  "+schoolCertificateNO+"  "+collegeCertificateNO);
	}
}

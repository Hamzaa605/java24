package inheritance;

public class SchoolPassOutPerson extends Person
{
    
	
	String schoolCertificateNO;
	
	 SchoolPassOutPerson(int id,String name,String schoolCertificateNO)
	 {
		super(id,name);
		this.schoolCertificateNO=schoolCertificateNO;
		
		System.out.println(id+"  "+name+"  "+schoolCertificateNO);
	 }
}

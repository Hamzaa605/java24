package inheritance;

public class Programmer extends FullTimeEmployee {
    
	String programmingLanguage;
	
	Programmer (int id,String name,int monthlySalary,int noOfLeaves,String insurance,String programmingLangauge)
	{
		super(id,name,monthlySalary,noOfLeaves,insurance);
		
		this.programmingLanguage=programmingLangauge;
		
		System.out.println(id+" "+name+" "+monthlySalary+" "+noOfLeaves+" "+insurance+" "+programmingLangauge);
	}
	}
	

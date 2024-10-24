package learnCollections;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MapExample2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	LinkedHashMap<String, String> PhoneNumbers=
			new LinkedHashMap<String, String>();
	
	PhoneNumbers.put("Amit", "7687698888");
	PhoneNumbers.put("Pooja","6774987889");
	PhoneNumbers.put("Priti", "7800909805");
	
	System.out.println(PhoneNumbers);
	
	//System.out.println(PhoneNumbers.containsKey("Pooja"));
	
	String name=sc.next();
	if(PhoneNumbers.containsKey(name)) 
	{
		System.out.println("Your phone no. is present"+PhoneNumbers.get(name));
		System.out.println("Do you want to changeit??(y/n)");
		char decision=sc.next().charAt(0);
		
		
		if(decision=='y') 
		{
			String newPhoneNo=sc.next();
			PhoneNumbers.put(name, newPhoneNo);
		}
	}
	else {
		String phoneNo=sc.next();
		PhoneNumbers.put(name, phoneNo);
		
	}
	
	System.out.println(PhoneNumbers);
}
}

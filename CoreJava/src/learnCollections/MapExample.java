package learnCollections;

import java.util.HashMap;
import java.util.Set;

public class MapExample {
public static void main(String[] args) {
	
	HashMap<Integer, String> var=new HashMap<Integer, String>();
     var.put(101, "Hamzaa");
     var.put(102, "Joel");
     var.put(103, "Gurjeet");
     var.put(null, null);
     var.put(101, "Rayyan");
     
     System.out.println(var);
     
     System.out.println(var.get(101));
     System.out.println(var.getOrDefault(1011, "Hello"));
     
     System.out.println("========================================");
     
     System.out.println(var.remove(101));
     System.out.println(var);
     
     System.out.println("========================================");
     
     System.out.println(var.keySet());
     
     System.out.println(var.values());
	
     System.out.println("========================================");
     
     Set<Integer> Keys=var.keySet();
     
     for(Integer k:Keys) 
     {
    	 System.out.println(k+" "+var.get(k));
     }
     
     System.out.println("========================================");
     
     System.out.println(var.containsKey(103));
     System.out.println(var.containsValue("Ryyan"));
}
}	
	
	
	
	
	
	
	

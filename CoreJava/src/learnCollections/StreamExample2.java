package learnCollections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamExample2 {

	public static void main(String[] args) {
		
		
		List<String> names 
		= Arrays.asList("Pooja","Amit","Joel","Sanika","Gurjeet","Hamzaa");
		//Consumer<String> a=(n)->System.out.println(n);
		names.stream().forEach((name)->{
			
			for(int i=1;i<=5;i++) {
				System.out.println(name+"="+name.charAt(0)+"="+name.length());
				}
			System.out.println("============================================");
			
			
			
		});
		
			names.stream().
			forEach((name)->System.out.println(name.charAt(0)+"-"+name.charAt(name.length()-1)));
		
	}
	
}

package learnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample1 {
public static void main(String[] args) {
	
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	for(int i=1;i<=20;i++) 
	{
		list.add(i);
	}
	
	System.out.println(list);
	
	System.out.println("=================================");
	
	Stream<Integer> stream = list.stream();
	//ForEach
	//Map
	//Filter
	//Reduce
	
	//Normal
	/*Consumer<Integer> c=(i)->System.out.println(i);
	stream.forEach(c);*/
	//Square
	Consumer<Integer> c=(i)->System.out.println(i*i);
	stream.forEach(c);
	
	System.out.println("=================================");

	List<String> names = Arrays.asList("Pooja","Amit","Joel","Sanika","Gurjeet","Hamzaa");
	Stream<String> Namestream = names.stream();
	/*Consumer<String> b=(n)->System.out.println(n.charAt(0));
	Namestream.forEach(b);*/
	
	Consumer<String> b=(n)->System.out.println(n+" "+n.length());
	Namestream.forEach(b);
	
	System.out.println("=================================");
	
	
}
}

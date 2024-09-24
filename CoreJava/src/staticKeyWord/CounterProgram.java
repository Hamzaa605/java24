package staticKeyWord;
class Counter
{
	static int count=0;
	Counter()
	{
		count++;
		System.out.println(count);
		
	}
}
public class CounterProgram {
 
	public static void main(String[] args) {
		
		for(int p=1;p<=100;p++)
		{
			new Counter();
		}
	
}
}

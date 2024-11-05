package multiThreading;

public class Counter {

	int count=0;
	
	synchronized public void increment() 
	{
		this.count++;
	}
	
}

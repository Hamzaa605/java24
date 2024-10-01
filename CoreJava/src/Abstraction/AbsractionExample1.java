package Abstraction;

abstract class Electronics
	{
		abstract void start();
		abstract void stop();
	}

class TV extends Electronics
{
	void start()
	{
		System.out.println("TV Started");
	}
	
	void stop() 
	{
		System.out.println("TV turend off");
	}
}

class AC extends Electronics
{
	void start()
	{
		System.out.println("AC Started");
	}
	
	void stop() 
	{
		System.out.println("AC turned off");
	}
}


public class AbsractionExample1 {	
	
	public static void main(String[] args) {
		
		new TV().start();
		new TV().stop();
		new AC().start();
		new AC().stop();
		
		Electronics washingMachine=new Electronics() 
		{
			void start() 
			{
			  System.out.println("machine start");	
			}
			
			void stop() 
			{
				System.out.println("turn off machine");
			}
		};
		
		washingMachine.start();
		washingMachine.stop();
		
	}
}

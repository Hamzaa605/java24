package multiThreading;

class Thread1 implements Runnable
{

	@Override
	public void run() {
		System.out.println("Thread1");
		
	}
	
}

public class mT4 {
	
public static void main(String[] args) {
	
	Thread t1=new Thread(new Thread1());
	t1.start();
	
	/*Runnable r1=new Runnable() {
		
		
		public void run() {
			
			System.out.println("Anonymous inner class");
			
		}
	};*/
	
	Thread t2=new Thread(new Runnable()
	{
public void run() {
			
			System.out.println("Anonymous inner class");
			
		}
	});
	t2.start();
	
}
}

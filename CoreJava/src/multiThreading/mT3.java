package multiThreading;

class T5 extends Thread
{
	public void run() 
	{
		while (true) {
			
			System.out.println("*********");
			
		}
	} 
}

public class mT3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		T5 thread = new T5();
		thread.setDaemon(true);
		thread.start();
		
		Thread.sleep(5000);
		
	}

}

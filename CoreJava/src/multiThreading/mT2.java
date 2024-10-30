package multiThreading;

class T3 extends Thread
{
	public void run() 
	{
		for(int i=1;i<=15;i++) 
		{
			System.out.println("Hamzaa");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class T4 extends Thread
{
	public void run() 
	{
		for(int a=1;a<=15;a++) 
		{
			System.out.println("Shaikh");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
	}

public class mT2 {

	public static void main(String[] args) {
		
		T3 t3 = new T3();
		t3.start();
		
		T4 t4 = new T4();
		t4.start();
		
		
	}
	
}

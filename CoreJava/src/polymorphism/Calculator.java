package polymorphism;

public class Calculator {

	
	void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c) 
	{
		System.out.println(a+b+c);
	}
	
	void add(float a,float b) 
	{
		System.out.println(a+b);
	}
	
	void add1(int e,int r)
	{
		System.out.println(e-r);
	}
	
	void add1(int e,int r,int j)
	{
		System.out.println(e-r-j);
	}
	
	void add1(float w,float v) 
	{
		System.out.println(w-v);
	}
}


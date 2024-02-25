package multiThreading.test;

public class Example {

	public synchronized void m1()
	{
		System.out.println(Thread.currentThread().getName()+" is inside m1 method");
		m2();
	}
	
	
	public synchronized void m2()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" is inside m2 method");
	}
	
}

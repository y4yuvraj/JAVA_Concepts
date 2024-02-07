package multiThreading.deadlockExample;

public class SecondResource {

	public synchronized void method1(FirstResource fr)
	{
		System.out.println("Inside method 1 of SR");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		fr.method2();
	}
	
	public synchronized void method2()
	{
		System.out.println("inside SR method 2");
	}
	
}

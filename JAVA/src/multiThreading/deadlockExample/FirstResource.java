package multiThreading.deadlockExample;

public class FirstResource {

	public synchronized void method1(SecondResource sr)
	{
		System.out.println("Inside method 1 of FR");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sr.method2();
	}
	
	public synchronized void method2()
	{
		System.out.println("inside FR method 2");
	}
	
}

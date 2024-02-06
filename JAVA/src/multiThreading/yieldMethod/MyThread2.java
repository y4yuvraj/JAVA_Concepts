package multiThreading.yieldMethod;

public class MyThread2 extends Thread{

	public String name;

	public MyThread2(String name) {
		super();
		this.name = name;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " running");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("hello " + name+" i will yield");
			Thread.yield(); //it may or may not work
		}
	}
	
}

package multiThreading.extendingThreadClass;


public class MyThread extends Thread {

	String name;
	
	public MyThread(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" running");
		for (int i = 0; i < 10; i++) {
			System.out.println("hello "+name);
		}
	}
	
}

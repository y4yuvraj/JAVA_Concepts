package multiThreading.implementingRunnableInterface;

public class MyThread implements Runnable {

	String name;
	
	public MyThread(String name)
	{
		this.name=name;
	}
	
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" running");
		for (int i = 0; i < 10; i++) {
			System.out.println("hello "+name);
		}
	}

}

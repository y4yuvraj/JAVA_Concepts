package multiThreading.waitAndNotify;

public class MyThread2 extends Thread {

	Object lock;
	String name;

	public MyThread2(Object lock,String name) {
		super();
		this.lock = lock;
		this.name=name;
	}
	
	public void run()
	{
		System.out.println("Thread started");
		synchronized (lock) {
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello "+name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}		
			lock.notify();
		}

	}
	
}

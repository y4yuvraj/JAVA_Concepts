package multiThreading.test.test2;

public class Example {

	static synchronized void staticSynchronizedMethod1()
	{
		System.out.println(Thread.currentThread().getName()+" is inside staticSynchronizedMethod1");
		for(int i=0;i<5;i++)
		{	
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" loop "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	static synchronized void staticSynchronizedMethod2()
	{
		System.out.println(Thread.currentThread().getName()+" is inside staticSynchronizedMethod2");
		for(int i=0;i<5;i++)
		{	
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" loop "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized void SynchronizedMethod1()
	{
		System.out.println(Thread.currentThread().getName()+" is inside SynchronizedMethod1");
		for(int i=0;i<5;i++)
		{	
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" loop "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

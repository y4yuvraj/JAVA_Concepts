package multiThreading.synchronisedBlock.usingClassName;

public class DisplayMessage {

	public void displayMethod(String name)
	{
		synchronized(DisplayMessage.class){
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello "+name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public synchronized void syncMethod1()
	{
		System.out.println(Thread.currentThread().getName() +" is running the synchronized method");
	}
	
	public void nonSyncMethod()
	{
		System.out.println(Thread.currentThread().getName() +" is running the non-synchronized method");
	}
	
	public static synchronized void staticSyncMethod()
	{
		System.out.println(Thread.currentThread().getName() +" is running the static synchronized method");
	}
	
}

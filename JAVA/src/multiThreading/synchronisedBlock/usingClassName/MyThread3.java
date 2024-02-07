package multiThreading.synchronisedBlock.usingClassName;

public class MyThread3 extends Thread {

	DisplayMessage dm;
	String name;
	
	
	public MyThread3(DisplayMessage dm,String name) {
		super();
		this.dm = dm;
		this.name=name;
	}



	public void run()
	{
		DisplayMessage.staticSyncMethod();
	}
	
}

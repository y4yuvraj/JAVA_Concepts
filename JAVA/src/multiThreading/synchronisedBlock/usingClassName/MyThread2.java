package multiThreading.synchronisedBlock.usingClassName;

public class MyThread2 extends Thread {
	DisplayMessage dm;
	String name;
	
	
	public MyThread2(DisplayMessage dm,String name) {
		super();
		this.dm = dm;
		this.name=name;
	}



	public void run()
	{
		dm.syncMethod1();
	}
}

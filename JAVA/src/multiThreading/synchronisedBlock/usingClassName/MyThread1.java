package multiThreading.synchronisedBlock.usingClassName;

public class MyThread1 extends Thread {

	DisplayMessage dm;
	String name;
	
	
	public MyThread1(DisplayMessage dm,String name) {
		super();
		this.dm = dm;
		this.name=name;
	}



	public void run()
	{
		dm.displayMethod(name);
	}
	
}

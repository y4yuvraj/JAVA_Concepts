package multiThreading.synchronisedBlock.usingClassName;

public class MyThread extends Thread {

	DisplayMessage dm;
	String name;
	
	
	public MyThread(DisplayMessage dm,String name) {
		super();
		this.dm = dm;
		this.name=name;
	}



	public void run()
	{
		dm.displayMethod(name);
	}
	
}

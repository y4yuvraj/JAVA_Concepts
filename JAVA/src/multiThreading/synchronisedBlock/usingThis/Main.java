package multiThreading.synchronisedBlock.usingThis;

public class Main {

	public static void main(String[] args) {
		DisplayMessage dm1=new DisplayMessage();
		DisplayMessage dm2=new DisplayMessage();
		
//		MyThread t1=new MyThread(dm1, "yuv");
//		MyThread t2=new MyThread(dm1, "steve");
//		t1.start();
//		t2.start();
		//op for above first all yuv then all steve
		
		
		MyThread t1=new MyThread(dm1, "yuv");   //run this and we should see same instance of 
		MyThread t2=new MyThread(dm2, "steve");	//DisplayMessage should not enter sync block but this should
		t1.start();
		t2.start();
		// both can run and enter sync blocl since instance of DisplayMessage is different
		
	}

}

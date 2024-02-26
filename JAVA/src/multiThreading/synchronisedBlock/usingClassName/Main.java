package multiThreading.synchronisedBlock.usingClassName;

public class Main {

	public static void main(String[] args) {
		DisplayMessage dm1=new DisplayMessage();
		DisplayMessage dm2=new DisplayMessage();
		
		
		MyThread1 t1=new MyThread1(dm1, "yuv1");  //this runs the sync block with class lock
		MyThread2 t2=new MyThread2(dm2, "yuv2"); //this runs the sync method
		MyThread3 t3=new MyThread3(dm1, "yuv3"); //this runs static synchronized method
		MyThread1 t4=new MyThread1(dm2, "yuv4");
 		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		t1.start();
 		//we want to make sure thread 1 is inside sync block
 		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 		t4.start();
		t2.start();
		t3.start();
		
	}
}
//we see thread 3 is not able to run 
/*

Hello yuv1
t2 is running the synchronized method
Hello yuv1
Hello yuv1
Hello yuv1
Hello yuv1
t3 is running the static synchronized method
Hello yuv4
Hello yuv4
Hello yuv4
Hello yuv4
Hello yuv4

 
 */

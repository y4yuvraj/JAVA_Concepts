package multiThreading.waitAndNotify;

public class Main {

	public static void main(String[] args) {
		Object lock=new Object();
		
		MyThread1 t1=new MyThread1(lock, "yuv");
		MyThread2 t2=new MyThread2(lock, "steve");
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
	}

}

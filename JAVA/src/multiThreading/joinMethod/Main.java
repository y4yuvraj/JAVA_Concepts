package multiThreading.joinMethod;

public class Main {

	
	public static void main(String[] args) {
		MyThread thread1=new MyThread("yuv");
		thread1.start();
		System.out.println(Thread.currentThread().getName()+" running");
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("hello steve");
			try {
				thread1.join(); //main thread will wait for thread1 to complete
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

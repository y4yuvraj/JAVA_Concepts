package multiThreading.extendingThreadClass;

public class Main {

	public static void main(String[] args) {
		MyThread thread1=new MyThread("yuv");
		MyThread thread2=new MyThread("steve");
		thread1.start();
		thread2.start();
	}
	
}

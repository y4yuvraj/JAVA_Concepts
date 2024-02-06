package multiThreading.implementingRunnableInterface;

import multiThreading.extendingThreadClass.MyThread;

public class Main {

	public static void main(String[] args) {
		
		MyThread obj1=new MyThread("steve");
		MyThread obj2=new MyThread("yuv");
		
		Thread thread1=new Thread(obj1);
		Thread thread2=new Thread(obj2);
		thread1.start();
		thread2.start();
	}

}

package multiThreading.yieldMethod;

public class Main {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1("yuv");
		MyThread2 t2=new MyThread2("steve");
		System.out.println("t1 priority = "+t1.getPriority());
		System.out.println("t2 priority = "+t2.getPriority());
		t1.start();
		t2.start();
	}
	
}

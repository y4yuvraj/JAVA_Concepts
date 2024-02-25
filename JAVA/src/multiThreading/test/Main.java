package multiThreading.test;


public class Main {

	public static void main(String[] args) {
		Example ex1=new Example();
		Example ex2=new Example(); 
		Thread t1=new Thread(()->{
			ex1.m1();
		},"t1");
		Thread t2=new Thread(()->{
			ex1.m1();
		},"t2");
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}

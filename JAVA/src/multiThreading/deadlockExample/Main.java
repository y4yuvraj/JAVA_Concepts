package multiThreading.deadlockExample;

public class Main {

	public static void main(String[] args) {
		
		FirstResource fr=new FirstResource();
		SecondResource sr=new SecondResource();
				
		MyThread1 t1= new MyThread1(fr, sr);
		MyThread2 t2=new MyThread2(fr, sr);
		
		Thread thread1=new Thread(t1);
		Thread thread2=new Thread(t2);
		
		thread1.start();
		thread2.start();

	}

}

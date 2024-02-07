package multiThreading.deadlockExample;

public class MyThread1 implements Runnable{


	FirstResource fr;
	SecondResource sr;


	public MyThread1(FirstResource fr, SecondResource sr) {
		super();
		this.fr = fr;
		this.sr = sr;
	}



	@Override
	public void run()
	{
		fr.method1(sr);
	}
	
}

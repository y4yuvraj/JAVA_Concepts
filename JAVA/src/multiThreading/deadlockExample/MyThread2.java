package multiThreading.deadlockExample;

public class MyThread2 implements Runnable {

	FirstResource fr;
	SecondResource sr;


	public MyThread2(FirstResource fr, SecondResource sr) {
		super();
		this.fr = fr;
		this.sr = sr;
	}



	@Override
	public void run()
	{
		sr.method1(fr);
	}

}

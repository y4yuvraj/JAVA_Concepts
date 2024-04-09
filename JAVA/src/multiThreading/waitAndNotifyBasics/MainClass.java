package multiThreading.waitAndNotifyBasics;

public class MainClass {

	static int total = 1;

	public static void main(String[] args) {

		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread: " + Thread.currentThread().getName() + "  started running");

				synchronized (this) {
					System.out.println("enterd the synchronized block");

					for (int i = 1; i < 100; i++) {
						total++;
					}

					System.out.println("printing this " + this);

					this.notify();

				}

			}
		});


		System.out.println("printing my Thread: " + myThread);
		myThread.setName("myThread");
		myThread.start();

		synchronized (myThread) {
			try {
				myThread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(total);

	}

}

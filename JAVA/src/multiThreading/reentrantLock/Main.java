package multiThreading.reentrantLock;

public class Main {

	public static void main(String[] args) {
		BankAccount sbi = new BankAccount();
		
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				sbi.withdraw(50);
			}
		};
		
		Thread t1= new Thread(r);
		Thread t2= new Thread(r);
		t1.start();
		t2.start();
	}
}

package multiThreading.reentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

	private int balance = 100;

	private final Lock lock = new ReentrantLock();

	public void withdraw(int amount) {
		boolean lockAcquired = false;
		try {
			lockAcquired = lock.tryLock(1000, TimeUnit.MILLISECONDS);
			if (lockAcquired) {
				// withdraw amount
				System.out.println(Thread.currentThread().getName() + " withdrawling");
				if (balance >= amount) {
					balance -= amount;
				} else {
					System.out.println(Thread.currentThread().getName() + " insufficient balance");
				}
				System.out.println(Thread.currentThread().getName() + " withdrawl completed");
				System.out.println("cuurent balance is " + balance);
			} else {
				System.out.println(Thread.currentThread().getName() + " could not acquire lock");
			}
		} catch (InterruptedException e) {
			// log the exception
			System.out.println("exception occured " + e.getMessage());
			Thread.currentThread().interrupt();
		} finally {
			if (lockAcquired) {
				lock.unlock(); // Ensure that we only unlock if the lock was actually acquired
			}
		}
	}

}

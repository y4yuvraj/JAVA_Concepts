package multiThreading.reentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

	private int balance=100;
	
	private final Lock lock= new ReentrantLock();
	
	public void withdraw(int amount)
	{
		try {
			if(lock.tryLock(1000, TimeUnit.MILLISECONDS))
			{
				//withdraw amount 
				System.out.println(Thread.currentThread().getName()+" withdrawling");
				if(balance>=amount)
				{
					balance-=amount;
				}
				else
				{
					System.out.println(Thread.currentThread().getName()+" insufficient balance");
				}
				System.out.println(Thread.currentThread().getName()+" withdrawl completed");
				System.out.println("cuurent balance is " + balance);
				lock.unlock();
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" could not acquire lock");
			}
		} catch (Exception e) {
			//log the exception
			System.out.println("exceptio occured "+e);
		}
	}
	
}

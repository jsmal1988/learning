package courses.concurrencythreads.b_interthreadcommunication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {

	private static int counter = 0;
	private static Lock lock = new ReentrantLock();

	private static void increment() {
		lock.lock();
		//here we have to add try,finall(catch will not occur in this example) because if sth will go wrong, then
		//we will be not able to unlock the lock, and we will have dead lock
		try {
			for (int i = 0; i < 10000; i++) {
				counter++;
			}
		}finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				increment();
			}
		});
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				increment();
			}
		});
		
		th1.start();
		th2.start();
		
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Counter: "+counter);
		
	}
}

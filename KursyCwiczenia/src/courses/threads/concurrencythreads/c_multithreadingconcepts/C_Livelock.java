package courses.threads.concurrencythreads.c_multithreadingconcepts;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Livelock {
	private Lock lock1 = new ReentrantLock(true);
	private Lock lock2 = new ReentrantLock(true);

	public void worker1() {
		while (true) {
			try {
				lock1.tryLock(50, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Worker1 acquires lock1...");
			System.out.println("Worker1 tries to get lock2...");
			
			if (lock2.tryLock()) {
				System.out.println("Worker1 acquires lock2...");
				lock2.unlock();
			} else {
				System.out.println("Worker1 cannot acquire lock2!");
				
				continue;
			}

			break;
		}
		lock1.unlock();
		lock2.unlock();
	}

	public void worker2() {
		while (true) {
			try {
				lock2.tryLock(50, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Worker2 acquires lock2...");
			System.out.println("Worker2 tries to get lock1...");
			
			if (lock1.tryLock()) {
				System.out.println("Worker2 acquires lock1...");
				lock1.unlock();
			} else {
				System.out.println("Worker2 cannot acquire lock1!");
				
				continue;
			}

			break;
		}
		lock1.unlock();
		lock2.unlock();

	}
}

public class C_Livelock {
	
	//when we run main method we will see that threads are not in block state, but they are continously accessing 
	//same lock
	public static void main(String[] args) {
		Livelock livelock = new Livelock();
			
		// after Java 8 it is possible to create Threads like this
		new Thread(livelock::worker1, "worker1").start();
		new Thread(livelock::worker2, "worker2").start();
	}

}

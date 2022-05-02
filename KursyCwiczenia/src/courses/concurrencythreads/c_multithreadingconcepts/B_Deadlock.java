package courses.concurrencythreads.c_multithreadingconcepts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Deadlock {
	private Lock lock1 = new ReentrantLock(true);
	private Lock lock2 = new ReentrantLock(true);

	public void worker1() {
		lock1.lock();
		System.out.println("Worker1 acquires lock1...");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock2.lock();
		System.out.println("Worker1 acquires lock2...");
		lock1.unlock();
		lock2.unlock();
	}

	public void worker2() {
		lock2.lock();
		System.out.println("Worker2 acquires lock2...");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock1.lock();
		System.out.println("Worker2 acquires lock1...");
		lock1.unlock();
		lock2.unlock();

	}
}

public class B_Deadlock {

	public static void main(String[] args) {
		Deadlock deadlock = new Deadlock();
		
		//after Java 8 it is possible to create Threads like this
		new Thread(deadlock::worker1,"worker1").start();
		new Thread(deadlock::worker2,"worker2").start();
	}

}

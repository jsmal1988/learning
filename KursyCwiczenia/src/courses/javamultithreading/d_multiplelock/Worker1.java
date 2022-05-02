package courses.javamultithreading.d_multiplelock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*In this example we have two threads
 * - when we start both threads, they run process methods
 * - process method triggers stageOne and stageTwo
 * - methods stageOne and stageTwo are synchronized
 * - because of synchronized keyword, both threads cannot run each method simultaneously
 * - problem is that there is only one thread lock in Worker1 object, so if thread1 runs method stageOne, then 
 * thread2 cannot run stageTwo method because lock is per class Worker1 not per method
 * - From this reason if we do not join threads, then it will take 2sec to run, and with join 4 sec, because each
 * thread will be waiting with stageOne and stageTwo method for another thread to release lock 
 */
public class Worker1 {
	private Random random = new Random();

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	
	public synchronized void stageOne() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list1.add(random.nextInt());
	}

	public synchronized void stageTwo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list2.add(random.nextInt());
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void main() {
		System.out.println("Starting");
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start));
		System.out.println("List1 size: " + list1.size() + "   List2 size: " + list2.size());
	}
}

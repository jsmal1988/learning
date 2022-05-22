package courses.threads.concurrencythreads.b_interthreadcommunication;

public class App3 {
	//Locking with custom locks
	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();
	public static int counter1 = 0;
	public static int counter2 = 0;

	public static void increment1() {
		synchronized (lock1) {
			counter1++;
		}
	}

	public static synchronized void increment2() {
		synchronized (lock2) {
			counter2++;
		}
	}

	public static void process() {
		long start = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increment1();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increment2();
				}
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
		System.out.println("The counter1 is: " + counter1);
		System.out.println("The counter2 is: " + counter2);
	}

	public static void main(String args[]) {
		process();
	}
}

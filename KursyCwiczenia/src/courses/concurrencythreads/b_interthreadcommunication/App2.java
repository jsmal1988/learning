package courses.concurrencythreads.b_interthreadcommunication;

public class App2 {
	public static int counter1 = 0;
	public static int counter2 = 0;
	// In this example, application will run longer because even we run each method
	// from different thread,
	// each thread has to wait until release of lock from different thread
	// it is prefered to use synchronized not per method but block
	//rule of thumb, we synchronized block that are 100% necessary
	/*
	 * public static synchronized void increment1() { counter1++; }
	 * 
	 * public static synchronized void increment2() { counter2++; }
	 */

	public static void increment1() {
		synchronized (App2.class) {
			counter1++;
		}
	}

	public static synchronized void increment2() {
		synchronized (App2.class) {
			counter2++;
		}
	}

	public static void process() {
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment1();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
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
		
		System.out.println("The counter1 is: " + counter1);
		System.out.println("The counter2 is: " + counter2);
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start));
	}

	public static void main(String args[]) {
		process();
	}
}

package threads.examples;

class Counter {
	private int value;

	public void increment() {
		synchronized (this) {
			value += 1;
		}
		//withotu synchronized the end result will be different for each run, with synchronized it will be always 30000
		//value += 1;
	}

	public int getValue() {
		return value;
	}
}

public class SynchronizedExample {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Runnable r = () -> {
			for (int i = 0; i < 100_000; i++) {
				c.increment();
			}
		};

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println(c.getValue());
	}
}

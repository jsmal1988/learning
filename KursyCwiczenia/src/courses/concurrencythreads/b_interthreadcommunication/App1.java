package courses.concurrencythreads.b_interthreadcommunication;

public class App1 {
	public static int counter = 0;
	
	//thanks to synchronized keyword we are sure that this metod is executed only by a signle thread at given time
	//Intrinsic lock here will be at App1 level
	public static synchronized void increment() {
		counter++;
	}
	
	public static void process() {
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increment();
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
		System.out.println("The counter is: "+counter);
	}

	public static void main(String args[]) {
		process();
	}
}

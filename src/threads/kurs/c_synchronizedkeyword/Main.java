package threads.kurs.c_synchronizedkeyword;

public class Main {
	
	private int count = 0;
	//2 adding synchronized make this method available for one method. Synchrionized add wewnetrzy lock on this method. 
	//If second thread will want to enter this method, it has to wait till lock will be release by first thread.
	public synchronized void increment() {
		count++;
	}
	
	public static void main(String args[]) {
		Main app = new Main();
		app.doWork();
	}
	
	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i< 10000; i++) {
					increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i< 10000; i++) {
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		//1. adding join will force main thread to wait till t1 and t2 finish
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//adding join will force main thread to wait till t1 and t2 finish
	
		System.out.println("Count is: "+count);
	}
}

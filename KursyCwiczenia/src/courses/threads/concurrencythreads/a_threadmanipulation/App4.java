package courses.threads.concurrencythreads.a_threadmanipulation;


class Runner7 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Runner7: "+i);
		}
		
	}
}

class Runner8 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Runner8: "+i);
		}
		
	}
}

public class App4 {

	public static void main(String[] args) {
		Thread t1 = new Runner7();
		Thread t2 = new Runner8();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Message will appear before finish of threads if we do not make join for threads execution");

	}

}

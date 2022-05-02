package courses.concurrencythreads.d_threadwithexecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Work implements Runnable {
	private int id;
	
	public Work(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		System.out.println("Task with id: "+id + " is in work - thread id: " + Thread.currentThread().getId());
		long duration = (long) (Math.random()*5);
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		
	}
}

public class B_FixedThreadPool {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i<10; i++) {
			executor.execute(new Work(i));
		}
		executor.shutdown();
	}

}

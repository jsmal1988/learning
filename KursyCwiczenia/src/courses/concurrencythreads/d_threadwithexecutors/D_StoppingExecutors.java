package courses.concurrencythreads.d_threadwithexecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class D_StoppingExecutors {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for(int i = 0; i<100;i++) {
			executor.execute(new Work(i+1));
		}
		
		executor.shutdown();
		
		try {
			if(!executor.awaitTermination(1000, TimeUnit.MILLISECONDS)) {
			//	executor.shutdownNow();
			}
		}catch(InterruptedException ex) {
			executor.shutdownNow();
		}
	}

}

package threads.kurs.e_threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable{
	/* Here we have processor class which has id as a id of task which is run from for loop
	 * run method simulates some action which takes 5sec to finish
	 * 
	 */
	private int id;
	
	public Processor(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		System.out.println("Starting: "+id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed: "+id);
	}
	
}

public class App {

	public static void main(String[] args) {
		//creating pool of two threads
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		//Submitting task to thread from threads pool
		for(int i = 0; i<5;i++) {
			executor.submit(new Processor(i));
		}
		// Initiates an orderly shutdown in which previously submitted
	    // tasks are executed, but no new tasks will be accepted.
		executor.shutdown();
		System.out.println("All tasks submitted.");
		//Thanks to below method, executor wait 1 day for finishing all tasks, when done then move to last line with 
		//SYSO all tasks complited
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All tasks complited");
	}

}

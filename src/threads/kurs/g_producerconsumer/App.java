package threads.kurs.g_producerconsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {
	/* You can add and remove items to this queue 
	 * you can handle different types of items in this queue
	 * thanks to using java.util.concurent queue is thread-safe
	 * in producer, put method waits when it will be able to put another number
	 * 
	 */
	
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}
	
	private static void producer() throws InterruptedException {
		Random random = new Random();
		
		while(true) {
			queue.put(random.nextInt(100));
		}
	}
	
	private static void consumer() throws InterruptedException {
		Random random = new Random();
		while(true) {
			Thread.sleep(100);
			if(random.nextInt(10)==0) {
				Integer value = queue.take();
				System.out.println("Taken value: "+value+ "; Quque size is: "+ queue.size());
			}
		}
	}

}

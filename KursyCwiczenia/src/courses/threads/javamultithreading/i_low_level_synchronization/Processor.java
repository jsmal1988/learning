package courses.threads.javamultithreading.i_low_level_synchronization;

import java.util.LinkedList;
import java.util.Random;

public class Processor {
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();
	
	public void produce() throws InterruptedException {
		int value = 0;
		while(true) {
			synchronized (lock) {
				//dzieki temu ze wait jest w petli, to po wywolaniu notify, warunek zostanie ponownie sprawdzony
				while(list.size() == LIMIT) {
					lock.wait();
					
				}
				list.add(value++);
				lock.notify();
			}
			
		}
	}

	public void consume() throws InterruptedException {
		Random random = new Random();
		while(true) {
			synchronized (lock) {
				while(list.size() == 0) {
					lock.wait();
				}
				System.out.print("List size: "+list.size());
				int value = list.removeFirst();
				System.out.println("; Value: "+value);
				lock.notify();
			}
			Thread.sleep(random.nextInt(1000));
		}
	}
}

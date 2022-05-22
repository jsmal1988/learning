package courses.threads.concurrencythreads.e_concurrentcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A_CollectionsSynchronization {

	public static void main(String[] args) {
		//for standardList will be an error, because two threads are manipulating in same time on same list
		//List<Integer> standardList = new ArrayList<Integer>();
		
		//here methods add and remove are synchronzied, intrinsic lock
		List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<Integer>());
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i<1000;i++) {
					//standardList.add(i);
					synchronizedList.add(i);
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i<1000;i++) {
					//standardList.add(i);
					synchronizedList.add(i);
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
		//System.out.println("Size of standard list: "+ standardList.size());
		System.out.println("Size of synchronized list: "+ synchronizedList.size());
	}

}

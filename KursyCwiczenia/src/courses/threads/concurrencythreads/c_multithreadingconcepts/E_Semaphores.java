package courses.threads.concurrencythreads.c_multithreadingconcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

enum Downloader {
	INSTANCE;
	private Semaphore semaphore = new Semaphore(3,true);
	
	public void download() {
		try {
			semaphore.acquire();
			downloadData();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			semaphore.release();
		}
	}
	
	public void downloadData() {
		try {
			System.out.println("Downloading data from web");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class E_Semaphores {
	public static void main(String args[]) {
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=0; i<12;i++) {
			service.execute(new Runnable() {
				@Override
				public void run() {
					Downloader.INSTANCE.download();
				}
				
			});
		}
	}
}

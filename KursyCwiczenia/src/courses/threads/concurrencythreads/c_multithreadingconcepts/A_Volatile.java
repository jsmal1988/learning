package courses.threads.concurrencythreads.c_multithreadingconcepts;

class Worker implements Runnable{
	//if we dont put volatile as terminated, then it can happen that terminated will be readed from cache, and 
	//change to false on 41 line will be not catched
	//thanks to that it will be stored in ram/main memory
	private volatile boolean terminated;
	@Override
	public void run() {
		while(!isTerminated()) {
			System.out.println("Working class is running...");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public boolean isTerminated() {
		return terminated;
	}
	public void setTerminated(boolean terminated) {
		this.terminated = terminated;
	}

	
}
public class A_Volatile {

	public static void main(String[] args) {
		Worker worker = new Worker();
		Thread t1 = new Thread(worker);
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		worker.setTerminated(true);
		System.out.println("Algorith is terminated");

	}

}

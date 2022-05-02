package courses.javamultithreading.b_basicthreadsynchronization;

class Processor extends Thread {
	private volatile boolean running = true;
	
	@Override
	public void run() {
		while(running) {
			System.out.println("Hello ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void shutdown() {
		running = false;
	}
}

public class Main {

	public static void main(String[] args) {
		Processor pro1 = new Processor();
		pro1.start();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pro1.shutdown();
	}

}

package threads.kurs.a_helloworld;

class ThreadByExtension extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("Hello from extension way " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadByImplementation implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("Hello from implemantation way " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class Main {

	public static void main(String[] args) {
		ThreadByExtension tbe = new ThreadByExtension();
		tbe.start();
		
		Thread tbi = new Thread(new ThreadByImplementation());
		tbi.start();
		
		Thread t3 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {

					System.out.println("Hello from implemantation by functional interface " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		t3.start();
		

	}

}

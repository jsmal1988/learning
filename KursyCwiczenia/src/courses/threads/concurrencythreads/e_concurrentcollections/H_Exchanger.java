package courses.threads.concurrencythreads.e_concurrentcollections;

import java.util.concurrent.Exchanger;


class FirstThread implements Runnable {

	private int counter;
	private Exchanger<Integer> exchanger;

	public FirstThread(Exchanger<Integer> exchanger) {
		this.exchanger = exchanger;
	}

	@Override
	public void run() {

		while (true) {

			counter = counter + 1;
			System.out.println("FirstThread incremented the counter: " + counter);

			try {
				counter = exchanger.exchange(counter);
				System.out.println("First thread get counter"+counter);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class SecondThread implements Runnable {

	private int counter;
	private Exchanger<Integer> exchanger;

	public SecondThread(Exchanger<Integer> exchanger) {
		this.exchanger = exchanger;
	}

	@Override
	public void run() {

		while (true) {

			counter = counter - 1;
			System.out.println("SecondThread decremented the counter: " + counter);

			try {
				counter = exchanger.exchange(counter);
				System.out.println("Second thread get counter"+counter);
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

public class H_Exchanger {

	public static void main(String[] args) {
		Exchanger<Integer> exchanger = new Exchanger<>();

		new Thread(new FirstThread(exchanger)).start();
		new Thread(new SecondThread(exchanger)).start();
	}

}

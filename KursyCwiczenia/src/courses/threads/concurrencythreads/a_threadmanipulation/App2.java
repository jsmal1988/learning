package courses.threads.concurrencythreads.a_threadmanipulation;


class Runner3 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("Runner3: "+i);
		}
		
	}
}

class Runner4 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println("Runner4: "+i);
		}
		
	}
}

public class App2 {

	public static void main(String[] args) {
		//It is not parallel execution - because it works on same processor so they share resource of it
		Thread t1 = new Thread(new Runner3());
		Thread t2 = new Thread(new Runner4());
		t1.start();
		t2.start();

	}

}

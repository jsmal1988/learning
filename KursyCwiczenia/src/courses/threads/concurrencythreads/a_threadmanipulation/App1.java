package courses.threads.concurrencythreads.a_threadmanipulation;


class Runner1 {
	public void execute() {
		for(int i = 0; i<10;i++) {
			System.out.println("Runner1: "+i);
		}
	}
}

class Runner2 {
	public void execute() {
		for(int i = 0; i<10;i++) {
			System.out.println("Runner2: "+i);
		}
	}
}

public class App1 {

	public static void main(String[] args) {
		Runner1 r1 = new Runner1();
		Runner2 r2 = new Runner2();
		r1.execute();
		r2.execute();

	}

}

package threads.examples;

public class Example5 {
	public static int counter = 0;

	public static void main(String[] args) {
		System.out.println("Example5");
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				increment();
				System.out.println(counter);
			}
		};
		ThreadExample te1 = new ThreadExample(r);
		ThreadExample te2 = new ThreadExample(r);
		ThreadExample te3 = new ThreadExample(r);
		
		te1.start();
		te2.start();
		te3.start();

	}
	private static  void increment() {

		counter = counter+1;
	}

}
class ThreadExample extends Thread {
	
	
	public ThreadExample(Runnable r) {
		super(r);
	}
	
}
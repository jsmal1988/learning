package courses.javamultithreading.d_multiplelock;

public class App {

	public static void main(String[] args) {
		//look at comments in Worker1 and Worker2, and comment of of the belowe before start
		new Worker1().main();
		new Worker2().main();
	}

}

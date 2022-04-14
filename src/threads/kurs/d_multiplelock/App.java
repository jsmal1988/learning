package threads.kurs.d_multiplelock;

public class App {

	public static void main(String[] args) {
		//look at comments in Worker1 and Worker2
		new Worker1().main();
		new Worker2().main();
	}

}

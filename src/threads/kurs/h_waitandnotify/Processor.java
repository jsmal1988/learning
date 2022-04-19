package threads.kurs.h_waitandnotify;

import java.util.Scanner;

public class Processor {
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer thread running...");
			//method of object class
			wait();
			System.out.println("Resumed.");
		}
	}

	public void consume() throws InterruptedException {
		Thread.sleep(2000);
		Scanner scanner = new Scanner(System.in);
		synchronized (this) {
			System.out.println("Waiting for return key...");
			scanner.nextLine();
			System.out.println("Return key pressed!");
			notify();
		}
	}
}

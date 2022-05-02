package threads.exercises.a_introduceyourself;

public class IntroduceYourself {
	public static void main(String args[]) {
		startNestedThreads(3);
	}
	public static void startNestedThreads(int count) {
		
		Runnable r = () -> {
			int counter = 0;
			while (counter < count) {
				System.out.println("Thread-"+counter);	
				counter = counter+1;
			}
			
		};
		
		Thread t1 = new Thread(r);
		t1.start();
	}
}

class ChildThread extends Thread {
	private final int children;

	ChildThread(int children) {
        this.children = children;
    }
	
	@Override
    public void run() {
		if(children > 0) {
			ChildThread childThread = new ChildThread(children - 1);
			System.out.println(getName());
            childThread.start();
		}
     
    }
}

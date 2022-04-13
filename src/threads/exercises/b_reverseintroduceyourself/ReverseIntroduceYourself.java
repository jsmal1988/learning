package threads.exercises.b_reverseintroduceyourself;

public class ReverseIntroduceYourself {
	public static void main(String args[]) {
		startReverseNestedThreads(6);
	}
	public static void startReverseNestedThreads(int count) {
		
		ChildThread ct = new ChildThread(count);
		ct.start();
		
		
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
			childThread.start();
            
            try {
				childThread.join();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println(getName());
            
		}
     
    }
}
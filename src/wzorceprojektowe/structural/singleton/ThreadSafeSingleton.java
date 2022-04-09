package wzorceprojektowe.structural.singleton;

public class ThreadSafeSingleton {
	//tutaj aby by³o thread safe
	private static volatile ThreadSafeSingleton instance = null;

	//tutaj kod aby nikt nie uzyl refleksji
	private ThreadSafeSingleton() {
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}
	//zamiast synchronizowac cala metode, to sprawdzamy czy jest null, jesli tak to wtedy robimy synchronized
	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized(ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();	
				}
				
			}
			
		}
		return instance;
	}
}

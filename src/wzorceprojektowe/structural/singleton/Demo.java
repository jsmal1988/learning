package wzorceprojektowe.structural.singleton;

public class Demo {

	public static void main(String[] args) {
		System.out.println("=====================StaticSingleton=====================");
		StaticSingleton instance = StaticSingleton.getInstance();
		System.out.println(instance);
		
		StaticSingleton instance2 = StaticSingleton.getInstance();
		System.out.println(instance2);
		
		System.out.println("=====================LazyLoadSingleton=====================");
		LazyLoadedSingleton lo1 = LazyLoadedSingleton.getInstance();
		System.out.println(lo1);
		
		LazyLoadedSingleton lo2 = LazyLoadedSingleton.getInstance();
		System.out.println(lo2);
		
		System.out.println("=====================ThreadSafeSingleton=====================");
		ThreadSafeSingleton ts1 = ThreadSafeSingleton.getInstance();
		System.out.println(ts1);
		
		ThreadSafeSingleton ts2 = ThreadSafeSingleton.getInstance();
		System.out.println(ts2);
		

	}

}

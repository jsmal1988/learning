package streams.parallel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class Main2 {
	private static long result = 0;

	public static void main(String[] args) {
		int numberToCalc = 10000000;
		long start = System.currentTimeMillis();
		sumUsingThreading(numberToCalc);
		long end = System.currentTimeMillis();
		System.out.println("Stream execution time with threading : "+ (end - start));
		
		
		start = System.currentTimeMillis();
		sumUsingParallel(numberToCalc);
		end = System.currentTimeMillis();
		System.out.println("Stream execution time with parallel stream : "+ (end - start));
	}
	
	private static long sumUsingThreading(long n) {
		Runtime r = Runtime.getRuntime();
	    int procs = r.availableProcessors();
	    ExecutorService es = Executors.newFixedThreadPool(procs);
	    
	    try {
	        for(long i = 1L; i <= n; i++) {
	            // Notice how we do not use variable i in the lambda directly
	            // That is because i would need to be effectively final to be used
	            // inside a lambda
	            long toAdd = i;
	            es.execute(() -> result += toAdd);
	        }
	    } catch (Exception e) {
	        System.out.println("An error occured");
	    } finally {
	        es.shutdown();
	    }    
	    return result;
	    
	}
	
	private static long sumUsingParallel(long n) {
	    return Stream.iterate(1L, a -> a + 1)
	        .limit(n)
	        .parallel()
	        .reduce(0L, Long::sum);        
	}
}

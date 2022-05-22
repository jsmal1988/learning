package streams.parallel;

import java.util.stream.Stream;

public class Main1 {

	public static void main(String[] args) {
		/*
		 * In this example, calling Stream.iterate() is expensive. 
		 * A lot of boxing and un-boxing occurs because of it. 
		 * Hence, a stream with very many elements will take a performance hit because of this.
		 */
		long start = System.currentTimeMillis();
		int sum = Stream.iterate(1, a -> a +1)
			    .limit(1000000)
			    .reduce(0, (a, b) -> a + b );
		
		long end = System.currentTimeMillis();
		System.out.println("Stream execution time without parallel: "+ (end - start));
		
		
		start = System.currentTimeMillis();
		sum = Stream.iterate(1, a -> a +1)
			    .limit(1000000)
			    .parallel()
			    .reduce(0, (a, b) -> a + b );
		
		end = System.currentTimeMillis();
		System.out.println("Stream execution time WITH parallel: "+ (end - start));
	}

}

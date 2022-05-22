package courses.threads.concurrencythreads.j_streams;

import java.util.stream.IntStream;

public class SerialAndParllelStreams {
	public static void main(String args[]) {
		long currentTime1 = System.currentTimeMillis();
		//Sequential Stream
		long numberOfPrimes1 = IntStream.rangeClosed(2, Integer.MAX_VALUE/100).filter(SerialAndParllelStreams::isPrime).count();
		System.out.println("Number of primes1: "+numberOfPrimes1);
		System.out.println("Time take by sequential:" +(System.currentTimeMillis()-currentTime1));
		
		long currentTime2 = System.currentTimeMillis();
		//Parallel Stream
		long numberOfPrimes2 = IntStream.rangeClosed(2, Integer.MAX_VALUE/100).parallel().filter(SerialAndParllelStreams::isPrime).count();
		System.out.println("Number of primes2: "+numberOfPrimes2);
		System.out.println("Time take by sequential:" +(System.currentTimeMillis()-currentTime2));
		
	}

	public static boolean isPrime(long num) {
		if (num <= 1)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		long maxDivisor = (long) Math.sqrt(num);
		for (int i = 3; i < maxDivisor; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}

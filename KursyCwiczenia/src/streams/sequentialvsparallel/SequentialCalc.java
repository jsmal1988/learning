package streams.sequentialvsparallel;

import java.util.stream.LongStream;

public class SequentialCalc {
	public long sumUsingSequential() {
	    return LongStream.rangeClosed(1L, 10L)
	        .peek(this::printThreadName)
	        .reduce(0L, this::printSum);
	}

	public void printThreadName(long l) {
	    String tName = Thread.currentThread().getName();
	    System.out.println(tName + " offers:" + l);
	}

	public long printSum(long i, long j) {
	    long sum = i + j;
	    String tName = Thread.currentThread().getName();
	    System.out.printf(
	        "%s has: %d; plus: %d; result: %d\n", 
	        tName, i, j, sum
	    );
	    
	    return sum;
	}
}

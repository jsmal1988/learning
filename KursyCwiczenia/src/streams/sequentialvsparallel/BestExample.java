package streams.sequentialvsparallel;

import java.util.stream.LongStream;

public class BestExample {

	public static void main(String[] args) {
		//new SequentialCalc().sumUsingSequential();
		
		new ParallelCalc().sumUsingParallel();

	}
	
}

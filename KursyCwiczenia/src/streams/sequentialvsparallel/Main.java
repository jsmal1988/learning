package streams.sequentialvsparallel;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		listOfNumbers.stream().forEach(number ->
		    System.out.println(number + " " + Thread.currentThread().getName())
		);
		
		listOfNumbers.parallelStream().forEach(number ->
		    System.out.println(number + " " + Thread.currentThread().getName())
		);
		
		//here sum will be 30 because 5 is added to each element, because it work in parallelStream
		int sum = listOfNumbers.parallelStream().reduce(5, Integer::sum);
		System.out.println("Sum: "+sum);
	}

}

package courses.threads.concurrencythreads.i_forkjoinframework.b_recursivetask;

import java.util.concurrent.ForkJoinPool;

public class Main2 {

	public static void main(String[] args) {
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveTask simpleRecursiveAction = new SimpleRecursiveTask(400);
		System.out.println( forkJoinPool.invoke(simpleRecursiveAction) );
		
		
	}
}

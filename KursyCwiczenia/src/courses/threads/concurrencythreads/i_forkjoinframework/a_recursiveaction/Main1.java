package courses.threads.concurrencythreads.i_forkjoinframework.a_recursiveaction;

import java.util.concurrent.ForkJoinPool;

public class Main1 {

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(500);
		forkJoinPool.invoke(simpleRecursiveAction);
	}

}

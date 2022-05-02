package courses.concurrencythreads.d_threadwithexecutors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Processor implements Callable<String>{
	private int id;
	
	public Processor(int id) {
		this.id = id;
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return "Id:"+id;
	}
	
}

public class E_CallableAndFuture {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		List<Future<String>> list = new ArrayList<Future<String>>();
		for(int i = 0; i<10;i++) {
			list.add(executor.submit(new Processor(i+1)));
		}
		
		list.forEach(el -> {
			try {
				System.out.println(el.get());
			} catch (InterruptedException | ExecutionException e) {
				
				e.printStackTrace();
			}
		});
		executor.shutdown();
	}

}

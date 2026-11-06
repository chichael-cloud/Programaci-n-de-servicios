package parallelSuming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ParallelSuming {
	public static void main(String[] args) {
		ExecutorService executor =
				Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.print("the number of processors : " + Runtime.getRuntime().availableProcessors());
		Runnable task = () -> {
			System.out.println("thread name is : " + Thread.currentThread().getName());
		};
		
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		for (int i = 0; i < 20; i++) {
			executor.submit(task);
		}
		Thread thread;
		
	}

}

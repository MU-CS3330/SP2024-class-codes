package edu.mu.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


import edu.mu.thread.sharedResources.Counter;
import edu.mu.thread.sharedResources.CounterKeySemaphore;
import edu.mu.threads.types.ThreadWithInheritance;
import edu.mu.threads.types.ThreadWithInterface;

public class Main {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		// Using Class inheriting Thread
//		for(int i=0; i<10; i++) {
//			ThreadWithInheritance thread = new ThreadWithInheritance(i);
//			thread.start();
//			try {
//				thread.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		CounterKeySemaphore.getInstance();
		ExecutorService executor = Executors.newFixedThreadPool(4);
		for(int i=0; i<100; i++) {
			ThreadWithInheritance thread = new ThreadWithInheritance(counter, i);
			//thread.start();
			executor.submit(thread);
		}
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count value: " + counter.getCount());
	}
}

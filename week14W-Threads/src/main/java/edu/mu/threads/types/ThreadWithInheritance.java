package edu.mu.threads.types;

import edu.mu.thread.sharedResources.Counter;

public class ThreadWithInheritance extends Thread {
	
	private int threadID;
	private Counter counter;
	
	public ThreadWithInheritance(int id) {
		threadID = id;
	}
	
	public ThreadWithInheritance(Counter counter, int id) {
		threadID = id;
		this.counter = counter;
	}
	
	@Override
	public void run() {
		//System.out.println("Thread #" + threadID + " currently running!");
		for(int i=0; i<10; i++) {
			counter.inrement();
		}
		System.out.println("Thread #" + threadID + " completed!");
	}
}

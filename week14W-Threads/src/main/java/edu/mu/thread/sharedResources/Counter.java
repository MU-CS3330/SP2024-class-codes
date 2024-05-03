package edu.mu.thread.sharedResources;

public class Counter {
	
	private int count = 0;
	
	public Counter() {}
	
	public void inrement() {
		synchronized (CounterKeySemaphore.getInstance().getSem()) {
			count++;
		}
	}
	
	public int getCount() {
		return count;
	}

}

package edu.mu.thread.sharedResources;

import java.util.concurrent.Semaphore;

public class CounterKeySemaphore {
	
	private static CounterKeySemaphore counterKeysem;
	private static Semaphore sem;
	
	private CounterKeySemaphore() {
//		this.sem = new Semaphore(4);
		this.setSem(new Semaphore(1));
	}
	
	public static CounterKeySemaphore getInstance() {
		if(counterKeysem == null) {
			return new CounterKeySemaphore();
		}
		return counterKeysem;	
	}

	public Semaphore getSem() {
		return sem;
	}

	public void setSem(Semaphore sem) {
		this.sem = sem;
	}
}

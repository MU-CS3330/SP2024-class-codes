package edu.mu.threads.types;

public class ThreadWithInterface implements Runnable {

private int threadID;
	
	public ThreadWithInterface(int id) {
		threadID = id;
	}
	
	@Override
	public void run() {
		System.out.println("Thread #" + threadID + " currently running!");
	}


}

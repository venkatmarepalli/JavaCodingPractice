package com.journaldev.threads;

import java.util.LinkedList;
import java.util.Queue;

public class HeavyWorkRunnable implements Runnable {
		
    private Queue<Integer> outputQueue = new LinkedList<Integer>();
	private Queue<Integer> inputQueue;

	
	
	public HeavyWorkRunnable() {
	    		
	   }
	public HeavyWorkRunnable(Queue<Integer> inputQueue) {
	       // store parameter for later user
		this.inputQueue = inputQueue;
	   }
	
    @Override
    public void run() {
        System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
        try {
        	processInputQueue();
            //Get database connection, delete unused data from DB
           // doDBProcessing();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
    }
    
    private synchronized void processInputQueue() {
    	//System.out.println("Peeking element-->"+inputQueue.peek() + " Current size of inpiutQueue="+ inputQueue.size());
    	while(inputQueue.peek()!=null){
    		System.out.println(Thread.currentThread().getName() + "-->input size -->"+ inputQueue.size());
    		outputQueue.add(inputQueue.remove());
    		System.out.println(Thread.currentThread().getName() + "-output size -->"+ outputQueue.size());
    	}
	}
    
    public Queue<Integer> getOutputQueue() {
        return this.outputQueue;
    }


	private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }

}
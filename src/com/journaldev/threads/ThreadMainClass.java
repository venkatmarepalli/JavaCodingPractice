package com.journaldev.threads;

import java.util.LinkedList;
import java.util.Queue;


public class ThreadMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//waitNotifyTest();
		int[] inputQueue={2,3,4,5,6};
		processJobs(inputQueue);
		
    }
	
	public static void processJobs(int[] inputQueue){
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i:inputQueue){
			queue.add(i);
		}
		System.out.println("Input Queue Size:" + queue.size());

		HeavyWorkRunnable hr = new HeavyWorkRunnable(queue);
		
		Thread t1 = new Thread(hr,"t1");
		Thread t2 = new Thread(hr,"t2");
		
		t1.start();
		t2.start();
		
		 try {
			 t1.join();
			 t2.join();
				
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		Queue<Integer> outputQueue = hr.getOutputQueue();
		System.out.println("Printing Output Queue.." + outputQueue.size());
		for(Integer i:outputQueue)
			System.out.println(i);
		System.out.println("Printing Done");

		
	}
	
	public static void waitNotifyTest(){
		{
	        Message msg = new Message("process it");
	        Waiter waiter = new Waiter(msg);
	        new Thread(waiter,"waiter").start();
	        
	       // Waiter waiter1 = new Waiter(msg);
	      //  new Thread(waiter1, "waiter1").start();
	        
	        Notifier notifier = new Notifier(msg);
	        new Thread(notifier, "notifier").start();
	       // System.out.println("All the threads are started");
	    }
	}
	
	public void testThreads(){
		Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
        Thread t3 = new Thread(new HeavyWorkRunnable(), "t3");
        
        t1.start();
        
        //start second thread after waiting for 2 seconds or if it's dead
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t2.start();
        
        //start third thread only when first thread is dead
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t3.start();
        
        //let all threads finish execution before finishing main thread
        try {
           // t1.join();
           // t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("All threads are dead, exiting main thread");
	}
	

}

package com.miit.thread.classes;

public class ThreadSleepInterruption extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		 try {  
             System.out.println("Thread will sleep for 5 seconds.");  
             Thread.sleep(5000);  
             System.out.println("Thread woke up after sleep.");  
         } catch (InterruptedException e) {  
             System.out.println("Thread was interrupted during sleep.");  
         }  
	}
}

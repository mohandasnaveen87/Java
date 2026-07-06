/**
 * 
 */
package com.miit.thread.test;

import com.miit.thread.classes.ThreadSleepInterruption;

/**
 * 
 */
public class ThreadSleepInterruptionTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub

		ThreadSleepInterruption th1 =new ThreadSleepInterruption();
		
		th1.start();
		try {
			Thread.sleep(2000);
			th1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inside Main thread: "+Thread.currentThread().getName());
	}

}

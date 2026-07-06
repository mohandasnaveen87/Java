/**
 * 
 */
package com.miit.thread.test;

import com.miit.thread.classes.ThreadSleepConcept;

/**
 * 
 */
public class ThreadSleepTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub

		ThreadSleepConcept th1 =new ThreadSleepConcept();
		
		th1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inside Main thread: "+Thread.currentThread().getName());
	}

}

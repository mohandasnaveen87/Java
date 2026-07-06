/**
 * 
 */
package com.miit.thread.classes;

/**
 * 
 */
public class ThreadUsingRunnableInterface implements Runnable {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		System.out.println("Thread Name "+Thread.currentThread().getName());
	}
}

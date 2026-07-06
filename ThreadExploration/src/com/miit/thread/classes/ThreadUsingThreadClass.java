/**
 * 
 */
package com.miit.thread.classes;

/**
 * 
 */
public class ThreadUsingThreadClass extends Thread {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		System.out.println("Thread Name "+this.getName());
	}
}

/**
 * 
 */
package com.miit.thread.test;

import com.miit.thread.classes.ThreadUsingRunnableInterface;

/**
 * 
 */
public class ThreadUsingRunnableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ThreadUsingRunnableInterface thread1=new ThreadUsingRunnableInterface();
		Thread t1=new Thread(thread1,"MyThread");
		//ThreadUsingThreadClass thread2=new ThreadUsingThreadClass();
		//thread1.start();
		//thread2.start();
		t1.start();
	}

}

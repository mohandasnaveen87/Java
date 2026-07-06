/**
 * 
 */
package com.miit.thread.test;

import com.miit.thread.classes.ThreadUsingThreadClass;

/**
 * 
 */
public class ThreadUsingThreadClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ThreadUsingThreadClass thread1=new ThreadUsingThreadClass();
		ThreadUsingThreadClass thread2=new ThreadUsingThreadClass();
		thread1.start();
		thread2.start();
	}

}

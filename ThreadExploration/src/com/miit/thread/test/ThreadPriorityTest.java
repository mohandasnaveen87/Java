/**
 * 
 */
package com.miit.thread.test;

import com.miit.thread.classes.ThreadPriority;

/**
 * 
 */
public class ThreadPriorityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t1 = new ThreadPriority("Thread 1", 3);  
		ThreadPriority t2 = new ThreadPriority("Thread 2", 7);  
		//ThreadPriority t3 = new ThreadPriority("Thread 3", 5);  
		//ThreadPriority t4 = new ThreadPriority("Thread 4", 7);  
	//	ThreadPriority t5 = new ThreadPriority("Thread 5", 1);  
  
        t1.start();  
        t2.start();  
//        t3.start();  
//        t4.start();  
//        t5.start();  
	}

}

package com.miit.thread.test;

import com.miit.thread.classes.ThreadJoin;

public class ThreadJoinTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadJoin th1=new ThreadJoin();
	
		
		th1.start();
		
		System.out.println("Inside thread"+Thread.currentThread().getName());
		th1.join();
		
		System.out.println("Completed");
		
		Thread thr=new Thread (()->System.out.println("new thread")) ;
	}

}

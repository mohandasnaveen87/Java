package com.miit.thread.classes;

public class ThreadPriority extends Thread {

	public ThreadPriority(String name,int priority) {
		//super(name);
		// TODO Auto-generated constructor stub
		setName(name);
		setPriority(priority);
	}
	 public void run() {  
	        System.out.println(getName() + " with priority " + getPriority() + " is running.");  
	    }  
	

}

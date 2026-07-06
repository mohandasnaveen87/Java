package com.miit.thread.classes;

public class MainDaemon extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		MainDaemon t1 = new MainDaemon();// creating thread
		MainDaemon t2 = new MainDaemon();
		MainDaemon t3 = new MainDaemon();
		t1.setDaemon(true);// now t1 is daemon thread
		t1.start();// starting threads
		t2.start();
		t3.start();
	}
}   
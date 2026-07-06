package com.miit.thread.classes;

public class ThreadJoin extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int j=0;j<5;j++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The j value is "+j);
		}
	}
}

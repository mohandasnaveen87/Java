package com.miit.thread.classes;
class MyTask extends Thread {  
    MyTask(ThreadGroup group, String name) {  
        super(group, name);  
    }  
  
    public void run() {  
        System.out.println("Thread running: " + Thread.currentThread().getName());  
    }  
}  
  
public class ThreadGroupExample {  
    public static void main(String[] args) {  
  
        // Creating a thread group  
        ThreadGroup tg = new ThreadGroup("MyThreadGroup");  
  
        // Creating threads inside the thread group  
        MyTask t1 = new MyTask(tg, "Thread-1");  
        MyTask t2 = new MyTask(tg, "Thread-2");  
  
        // Starting threads  
        t1.start();  
        t2.start();  
    }  
}  
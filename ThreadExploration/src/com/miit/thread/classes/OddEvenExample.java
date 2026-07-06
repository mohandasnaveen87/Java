package com.miit.thread.classes;
public class OddEvenExample {  
    int contr = 1;  
    static int NUM;  
  
    public void displayOddNumber() {  
        synchronized (this) {  
            while (contr < NUM) {  
                while (contr % 2 == 0) {  
                    try { wait(); } catch (InterruptedException e) {}  
                }  
                System.out.print(contr + " ");  
                contr++;  
                notify();  
            }  
        }  
    }  
  
    public void displayEvenNumber() {  
        synchronized (this) {  
            while (contr < NUM) {  
                while (contr % 2 == 1) {  
                    try { wait(); } catch (InterruptedException e) {}  
                }  
                System.out.print(contr + " ");  
                contr++;  
                notify();  
            }  
        }  
    }  
  
    public static void main(String[] args) {  
        NUM = 20;  
        OddEvenExample oe = new OddEvenExample();  
   
        Thread t1 = new Thread(() -> oe.displayEvenNumber());  
        Thread t2 = new Thread(() -> oe.displayOddNumber());  
  
        t1.start();  
        t2.start();  
    }  
}  
package com.miit.inheritance;
class A
{
    int i = 10;
    public void methodA() {
    	System.out.println("In A");
    }
}
 
class B extends A
{
    int i = 20;
    
    public void methodA() {
    	System.out.println("In Class B");
    }
    public void methodB() {}
}
 
public class RunTimPolyvarhiding
{
    public static void main(String[] args)
    {
        A a = new B();
         
        a.methodA();
        System.out.println(a.i);
    }
}